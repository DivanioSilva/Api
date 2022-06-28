package com.ds.api.api.clients;

import com.ds.api.api.domain.PersonDto;
import com.ds.api.api.domain.PersonWithIdDto;
import com.ds.api.api.exceptions.PersonNotFoundException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "personClient", url = "${person.ms.url}")
public interface PersonClient {

    @PostMapping(value = "/")
    PersonWithIdDto createPerson(@RequestBody PersonDto personDto);

    @GetMapping(value = "/all")
    List<PersonWithIdDto> getAllPersons();

    @PutMapping(value = "{personId}", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    PersonDto updatePerson(@PathVariable Long personId, @RequestBody PersonDto person) throws PersonNotFoundException;
}

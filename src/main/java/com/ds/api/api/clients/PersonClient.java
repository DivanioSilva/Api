package com.ds.api.api.clients;

import com.ds.api.api.domain.PersonDto;
import com.ds.api.api.domain.PersonWithIdDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "personClient", url = "${person.ms.url}")
public interface PersonClient {

    @PostMapping(value = "/")
    PersonWithIdDto createPerson(@RequestBody PersonDto personDto);

    @GetMapping(value = "/all")
    List<PersonWithIdDto> getAllPersons();
}

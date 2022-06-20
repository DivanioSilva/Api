package com.ds.api.api.controller;

import com.ds.api.api.clients.PersonClient;
import com.ds.api.api.domain.PersonDto;
import com.ds.api.api.domain.PersonWithIdDto;
import com.ds.api.api.exceptions.PersonNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "person/")
public class PersonController {
    private final PersonClient personClient;

    @PostMapping
    public PersonWithIdDto savePerson(@RequestBody PersonDto personDto){
        return this.personClient.createPerson(personDto);
    }

    @GetMapping(value = "all",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonWithIdDto> getAll(){
        return this.personClient.getAllPersons();
    }

    @PutMapping(value = "{personId}", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonDto updatePerson(@PathVariable("personId") Long personId, @RequestBody PersonDto person)
            throws PersonNotFoundException {
        return this.personClient.updatePerson(personId, person);
    }
}

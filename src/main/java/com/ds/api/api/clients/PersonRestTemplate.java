package com.ds.api.api.clients;

import com.ds.api.api.domain.PersonDto;
import com.ds.api.api.domain.PersonWithIdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class PersonRestTemplate {
    private final RestTemplate restTemplate;

    public PersonWithIdDto save(PersonDto personDto){
        return restTemplate.postForEntity("http://localhost:8091/person/", personDto, PersonWithIdDto.class).getBody();
    }
}

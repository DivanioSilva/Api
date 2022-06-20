package com.ds.api.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonWithIdDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
}
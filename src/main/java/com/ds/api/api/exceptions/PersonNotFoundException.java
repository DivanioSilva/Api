package com.ds.api.api.exceptions;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException() {
        super("Person not found");
    }
}

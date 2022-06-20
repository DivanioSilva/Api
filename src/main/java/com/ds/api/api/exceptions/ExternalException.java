package com.ds.api.api.exceptions;

import lombok.Builder;

@Builder
public class ExternalException {
    private String message;
    private int code;
}

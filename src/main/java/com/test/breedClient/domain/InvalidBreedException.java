package com.test.breedClient.domain;

public class InvalidBreedException extends RuntimeException {
    public InvalidBreedException(String message) {
        super(message);
    }
}

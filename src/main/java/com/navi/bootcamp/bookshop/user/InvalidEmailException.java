package com.navi.bootcamp.bookshop.user;

public class InvalidEmailException extends Exception {
    public InvalidEmailException() {
        super("User with same email already created");
    }
}

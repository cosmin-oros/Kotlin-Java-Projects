package com.company;

public class AgeLessThanZeroException extends Exception {
    public AgeLessThanZeroException(String message){
        super(message);
    }
}

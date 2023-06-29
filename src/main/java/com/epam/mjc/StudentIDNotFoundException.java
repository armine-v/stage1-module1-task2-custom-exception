package com.epam.mjc;


public class StudentIDNotFoundException extends IllegalArgumentException{
    public StudentIDNotFoundException(String message){
        super(message);
    }
}
package com.example.springsample1app;

import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

    private String message = "default message";

    public SampleComponent() {
        super();
    }

    public String message() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
    
}

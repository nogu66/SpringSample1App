package com.example.springsample1app;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    
    public Post getPost() {
        return new Post(0, 0, "Dummy", "This is sample.");
    }
}

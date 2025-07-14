package com.example.headingdirectory.controller;

import com.example.headingdirectory.model.*;
import com.example.headingdirectory.service.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@CrossOrigin(origins = "*")
@RestController
public class HeadingController{

    @Autowired
    private HeadingJpaService hr;

    @GetMapping("/")
    public Heading getHeading(){
        return hr.getHeading();
    }

    @PostMapping("/")
    public Heading postHeading(@RequestBody Heading heading){
        return hr.postHeading(heading);
    }
}

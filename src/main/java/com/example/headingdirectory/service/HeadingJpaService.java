package com.example.headingdirectory.service;

import com.example.headingdirectory.repository.*;
import com.example.headingdirectory.model.Heading;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Service
public class HeadingJpaService implements HeadingRepository{

    @Autowired
    private HeadingJpaRepository hr;

    @Override
    public Heading getHeading(){
        return hr.findAll().stream()
                .findFirst()
                .orElse(new Heading("Default Heading"));
    }

    @Override
    public Heading postHeading(Heading heading){
        hr.deleteAll();
        return hr.save(heading);
    }
}
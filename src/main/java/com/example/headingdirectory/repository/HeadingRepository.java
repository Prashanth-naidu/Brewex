package com.example.headingdirectory.repository;

import com.example.headingdirectory.model.Heading;

import java.util.ArrayList;

public interface HeadingRepository {
    Heading getHeading();

    Heading postHeading(Heading heading);
}

package com.example.headingdirectory.repository;

import com.example.headingdirectory.model.Heading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeadingJpaRepository extends JpaRepository<Heading, Integer> {
}
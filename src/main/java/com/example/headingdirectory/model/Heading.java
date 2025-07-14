package com.example.headingdirectory.model;

import javax.persistence.*;

@Entity
@Table(name="heading")
public class Heading{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="content")
    private String content;

    public Heading(){}

    public Heading(String content){
        this.content = content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
package com.example.getpersonbio_mvp.Model;

public class PersonModel {
    String name;
    String bio;
    int age;
    int id;

    public PersonModel(String name, String bio, int age, int id) {
        this.name = name;
        this.bio = bio;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



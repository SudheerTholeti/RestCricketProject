package com.skytech.restcricket.model;

public class Player {
    private int id;
    private String name;
    private int age;
    private String role;
    private int noOfMatches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", noOfMatches=" + noOfMatches +
                '}';
    }
}

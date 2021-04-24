package com.company;

public class Professor {
    private String name;
    private char gender;
    private int age;
    private String email;

    public Professor(String name, char gender, int age, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public char getGender() { return gender; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public String toString() {
        return "Name" + getName() +
                "\nGender" + getGender() +
                "\nAge" + getAge() +
                "\nEmail" + getEmail();
    }
}

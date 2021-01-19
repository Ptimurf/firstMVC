package ru.polinov.springmvc.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Name is empty!")
    @Size(min=2,max=30,message = "Name length between 2 and 30")
    private String name;

    @Min(value=0 , message = "Min age is 0")
    private int age;

    @NotEmpty(message = "Email is empty")
    @Email(message = "Email is not valid ")
    private String email;
    public Person(){
    }

    public Person(int id, String name,int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
}

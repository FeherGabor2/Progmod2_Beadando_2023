package com.fehergabornorbert.app.rest.Models;

import com.fehergabornorbert.app.rest.Enum.Nationality;

import javax.persistence.*;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String position;
    @Column
    private int age;
    @Column
    private Nationality nationality;
    @Column
    private int palettes;


    public long getId() {return id;}

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public int getPalettes() {
        return palettes;
    }

    public void setPalettes(int palettes) {
        this.palettes = palettes;
    }
}

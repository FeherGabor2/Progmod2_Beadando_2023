package com.fehergabornorbert.app.rest.Models;

import com.fehergabornorbert.app.rest.Enum.Nationality;

import javax.persistence.*;

@Entity
public class Palettes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String gyarto;
    @Column
    private String meret;
    @Column
    private String szin;
    @Column
    private int suly;
    @Column
    private int teherbiras;


    public long getId() {return id;}

    public void setId(long id) {
        this.id = id;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getMeret() {
        return meret;
    }

    public void setMeret(String meret) {
        this.meret = meret;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public int getTeherbiras() {
        return teherbiras;
    }

    public void setTeherbiras(int teherbiras) { this.teherbiras = teherbiras;}
}

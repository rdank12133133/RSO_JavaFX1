package com.example.rso_java_majdonko;

import java.util.Date;

public class Event {
    protected int id;
    protected String ime;
    protected Date date;

    public Event(int id, String ime, Date date){
        this.id = id;
        this.ime = ime;
        this.date = date;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getIme(){
        return this.ime;
    }

    public void setIme(String ime){
        this.ime = ime;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }
}

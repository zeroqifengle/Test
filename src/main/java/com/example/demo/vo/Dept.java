package com.example.demo.vo;


import org.springframework.stereotype.Controller;


public class Dept {

    private String name;

    private String loc;

    public Dept(String name, String loc) {
        this.name = name;
        this.loc = loc;
    }

    public Dept() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}

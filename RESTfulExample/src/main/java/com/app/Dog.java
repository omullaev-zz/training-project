package com.app;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog {

    public String id;
    public String name;
    public Date dateOfBirth;
    public Integer height;
    public Integer weight;

    public Dog() {

    }

    public Dog(String id, String name, String dateOfBirth, Integer height, Integer weight) {
        setId(id);
        setName(name);
        setDateOfBirth(dateOfBirth);
        setHeight(height);
        setWeight(weight);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
        Date date = new Date();
        try {
            date = sdf.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.dateOfBirth = date;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

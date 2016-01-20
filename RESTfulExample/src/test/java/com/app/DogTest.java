package com.app;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DogTest {

    @Test
    public void DateTest() throws ParseException {
        Dog dog = new Dog();
        String someDate = "05.10.2011";
        dog.setDateOfBirth(someDate);

        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
        Date date = new Date();
        date = sdf.parse(someDate);

        assertThat("Set date method works incorrectly", dog.getDateOfBirth(), equalTo(date));
    }

}
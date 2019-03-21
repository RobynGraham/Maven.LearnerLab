package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestPerson {

    @Test
    public void personConstructorTest(){

        String name = "";
        long id = 000000;
        //Given
        long expectedId = 246790;
        String expectedName = "Joe";

        //When
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        long id = 000000;
        String name = "";
        Person person;
        person = new Person(id, name);

        // Given
        String expected = "Joe";
        person.setName(expected);
        //When

        String actual = person.getName();
        //Then
        Assert.assertEquals(expected,actual);

    }

}

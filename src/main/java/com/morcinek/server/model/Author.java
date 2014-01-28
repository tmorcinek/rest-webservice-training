package com.morcinek.server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * By Tomasz Morcinek in 2014.
 */
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Author {

    private String firstName;

    private String lastName;

    private String email;

    private String www;

    public Author() {
    }

    public Author(String firstName, String lastName, String email, String www) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.www = www;
    }

}

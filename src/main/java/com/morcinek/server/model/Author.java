package com.morcinek.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * By Tomasz Morcinek in 2014.
 */
@Entity
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Author {

    @Id
    @GeneratedValue
    private Long id;

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

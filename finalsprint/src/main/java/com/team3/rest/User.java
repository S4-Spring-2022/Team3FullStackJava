package com.team3.rest;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;

    private String userName;
    private String password;
    private Long person_id;

    public User() {
    }

    public User(String userName, String password, Long person_id) {
        this.userName = userName;
        this.password = password;
        this.person_id = person_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPerson() {
        return person_id;
    }

    public void setPerson(Long person_id) {
        this.person_id = person_id;
    }

    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", person=" + person_id + "]";
    }
}

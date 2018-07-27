package com.makame.diary.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;

@Entity
public class Baby{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Getter
    private String firstName;
    @Getter
    private String lastName;

    @OneToMany
    private Set<Event> firstActions = new HashSet<>();

    public Baby(String firstName,String lastName ) {
 
		this.firstName = firstName;
        this.lastName = lastName;

    }
}
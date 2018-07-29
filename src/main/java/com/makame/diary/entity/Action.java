
package com.makame.diary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@NoArgsConstructor
public class Action{

    @Id
    @GeneratedValue
    private long id;

    @Getter 
    private String name;

    public Action(String name) {
        this.name = name;
    }
}
package com.makame.diary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Action{

    @Id
    @GeneratedValue

    @Getter
    private long id;

    @Getter
    private String name;

    public Action(String name) {
        this.name = name;
    }
}
package com.makame.diary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@NoArgsConstructor
public class Action{

    @Id
    @GeneratedValue

    @Getter @Setter
    private long id;

    @Getter @Setter
    private String name;

    public Action(String name) {
        this.name = name;
    }
}
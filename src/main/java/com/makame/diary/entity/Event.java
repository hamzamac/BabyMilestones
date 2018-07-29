package com.makame.diary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Event{
    @Id
    @GeneratedValue
    private long id;

    @Getter
    private Integer week;

    @ManyToOne
    private Baby owner;

    @OneToOne
    @Getter
    private Action firstTimeAction;

    public Event(Integer week) {
        this.week = week;
      //  this.action = action;
    }
}
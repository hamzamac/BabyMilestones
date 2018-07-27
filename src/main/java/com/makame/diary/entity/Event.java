package com.makame.diary.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Event{
    @Id
    @GeneratedValue
    private long id;

    @Getter
    private Integer week;
    @Getter
    private Action action;

    public Event(Integer week, Action action) {
        this.week = week;
        this.action = action;
    }
}
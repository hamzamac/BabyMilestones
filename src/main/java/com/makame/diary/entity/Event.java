package com.makame.diary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Event{
    @Id
    @GeneratedValue
    private long id;

    @Getter @Setter
    private Integer week;

    @Getter @Setter
    private Action action;

    public Event(Integer week, Action action) {
        this.week = week;
        this.action = action;
    }
}
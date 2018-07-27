package com.makame.diary.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Baby{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;

    @Getter @Setter
    private String firstName;
    
    @Getter @Setter
    private String lastName;

    //@OneToMany(mappedBy = )
    @Getter @Setter
    private Set<Event> events = new HashSet<>();

    public Baby(String firstName,String lastName ) {
		this.firstName = firstName;
        this.lastName = lastName;
    }
}
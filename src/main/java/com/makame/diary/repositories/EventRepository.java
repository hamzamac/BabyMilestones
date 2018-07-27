package com.makame.diary.repositories;

import com.makame.diary.entity.Event;

import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long>{}
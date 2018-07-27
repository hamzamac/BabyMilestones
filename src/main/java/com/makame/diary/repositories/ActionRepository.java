package com.makame.diary.repositories;

import com.makame.diary.entity.Action;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends CrudRepository<Action, Long>{}
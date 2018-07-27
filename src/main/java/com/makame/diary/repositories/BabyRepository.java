package com.makame.diary.repositories;

import com.makame.diary.entity.Baby;

import org.springframework.data.repository.CrudRepository;

public interface BabyRepository extends CrudRepository<Baby,Long>{}
package com.makame.diary.repositories;

import com.makame.diary.entity.Baby;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyRepository extends CrudRepository<Baby,Long>{}
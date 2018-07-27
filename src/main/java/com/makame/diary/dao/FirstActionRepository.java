package com.makame.diary.dao;

import java.util.Collection;

import com.makame.diary.entity.FirstAction;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstActionRepository extends CrudRepository<FirstAction,Long>{

    Collection<FirstAction> findByBabyId(long id);
}
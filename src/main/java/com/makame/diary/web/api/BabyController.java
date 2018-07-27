package com.makame.diary.web.api;

import java.util.Collection;

import com.makame.diary.entity.Baby;
import com.makame.diary.repositories.BabyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/baby")
public class BabyController{

    private final BabyRepository babyRepository;

    @Autowired
    public BabyController(BabyRepository babyRepository){
        this.babyRepository = babyRepository;
    }

    @GetMapping
    Collection<Baby> getBabies(){
        return (Collection<Baby>) babyRepository.findAll();
    }

}
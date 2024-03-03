package ru.skblab.mesler.springskblabmesler.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("i am a cat and i am running right now!");
    }

    @Override
    public void eat() {
        System.out.println("i am a cat and i am eating right now!");
    }

    @Override
    public void sleep() {
        System.out.println("i am a cat and i am sleeping right now!");
    }

    @PostConstruct
    public void construct(){
        System.out.println("Bean Cat created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean Cat destroyed");
    }
}

package ru.skblab.mesler.springskblabmesler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.skblab.mesler.springskblabmesler.model.Animal;
import ru.skblab.mesler.springskblabmesler.model.Cat;
import ru.skblab.mesler.springskblabmesler.model.Dog;

@Service
public class AnimalShelterServiceSetter {
    private Animal dog;
    private Animal cat;

    @Autowired
    private void setDog(@Qualifier("dog") Dog dog){
        this.dog = dog;
    }

    @Autowired
    private void setCat(@Qualifier("cat") Cat cat){
        this.cat = cat;
    }

    private void animalRun(){
        dog.run();
        cat.run();
    }

    private void animalEat(){
        dog.eat();
        cat.eat();
    }

    private void animalSleep(){
        dog.sleep();
        cat.sleep();
    }
}

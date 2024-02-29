package ru.skblab.mesler.springskblabmesler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.skblab.mesler.springskblabmesler.model.Animal;
import ru.skblab.mesler.springskblabmesler.model.Cat;
import ru.skblab.mesler.springskblabmesler.model.Dog;

@Service
public class AnimalShelterServiceSetter {
    @Qualifier("dog")
    private Animal dog;
    @Qualifier("cat")
    private Animal cat;

    @Autowired
    private void setDog(Dog dog){
        this.dog = dog;
    }

    @Autowired
    private void setCat(Cat cat){
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

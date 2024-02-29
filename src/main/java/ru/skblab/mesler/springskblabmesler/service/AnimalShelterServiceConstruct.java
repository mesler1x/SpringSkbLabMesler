package ru.skblab.mesler.springskblabmesler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.skblab.mesler.springskblabmesler.model.Animal;
import ru.skblab.mesler.springskblabmesler.model.Cat;
import ru.skblab.mesler.springskblabmesler.model.Dog;

@Service
public class AnimalShelterServiceConstruct {
    @Qualifier("dog")
    private final Animal dog;
    @Qualifier("cat")
    private final Animal cat;


    @Autowired
    public AnimalShelterServiceConstruct(Dog dog, Cat cat) {
        this.dog = dog;
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

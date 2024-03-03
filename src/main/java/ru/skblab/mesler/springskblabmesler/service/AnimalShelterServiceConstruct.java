package ru.skblab.mesler.springskblabmesler.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.skblab.mesler.springskblabmesler.model.Animal;
import ru.skblab.mesler.springskblabmesler.model.Cat;
import ru.skblab.mesler.springskblabmesler.model.Dog;

@Service
public class AnimalShelterServiceConstruct {
    private final Animal dog;
    private final Animal cat;

    public AnimalShelterServiceConstruct(@Qualifier("dog") Dog dog, @Qualifier("cat") Cat cat) {
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

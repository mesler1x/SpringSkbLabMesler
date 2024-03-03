package ru.skblab.mesler.springskblabmesler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.skblab.mesler.springskblabmesler.model.Animal;

@Service
public class AnimalShelterServiceAnnotation {
    @Autowired//так делать нельзя
    @Qualifier("dog")
    private Animal dog;
    @Autowired //так делать нельзя
    @Qualifier("cat")
    private Animal cat;

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

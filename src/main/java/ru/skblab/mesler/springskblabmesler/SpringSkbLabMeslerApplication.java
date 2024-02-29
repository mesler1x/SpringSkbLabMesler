package ru.skblab.mesler.springskblabmesler;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.skblab.mesler.springskblabmesler.model.Animal;
import ru.skblab.mesler.springskblabmesler.model.Cat;
import ru.skblab.mesler.springskblabmesler.model.Dog;
import ru.skblab.mesler.springskblabmesler.service.AnimalShelterServiceConstruct;

@SpringBootApplication
public class SpringSkbLabMeslerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSkbLabMeslerApplication.class, args);
    }

}

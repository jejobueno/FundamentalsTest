package be.intecbrussel.the_notebook.entities.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.entities.service.ForestNoteBook;

import javax.security.auth.login.AccountNotFoundException;
import java.util.concurrent.Flow;

public class NatureApp {

    public static void main(String[] args) {

        ForestNoteBook mySpecimensNoteBook = new ForestNoteBook();

        Weed aloeVera = new Weed("Aloe vera", 2.3);
        Bush bunnyEarCactus = new Bush("Bunny Ear Cactus",LeafType.NEEDLE);
        Bush coralCactus = new Bush("Coral Cactus",LeafType.SPEAR);
        Three pine = new Three("Pine", LeafType.SPEAR);
        Flower amaryllis = new Flower("Amaryllis", 6);

        Carnivore leon = new Carnivore("Leon", 130, 1.20, 2.00);
        Carnivore polarBear = new Carnivore("Polar Bear", 4.50, 2.40, 3);
        Carnivore hyena = new Carnivore("Hyena", 44, 7.0,9.5);
        Carnivore eagle = new Carnivore("Eagle",9,7,1);
        Omnivore bear = new Omnivore("Bear",250,1.80,1.40);
        bear.addPlantToDiet(aloeVera);
        Omnivore raccoon = new Omnivore("Raccoon", 35,2.3,4);
        raccoon.addPlantToDiet(aloeVera);
        raccoon.addPlantToDiet(amaryllis);
        raccoon.addPlantToDiet(pine);
        raccoon.addPlantToDiet(pine);
        Omnivore civet = new Omnivore("Civet",32,4,5.3);
        civet.addPlantToDiet(amaryllis);
        Herbivore alpaca = new Herbivore("Alpaca", 48,8.1,2);
        alpaca.addPlantToDiet(amaryllis);
        alpaca.addPlantToDiet(aloeVera);
        Herbivore panda = new Herbivore("Panda",7,6,1.2);
        panda.addPlantToDiet(aloeVera);

        mySpecimensNoteBook.addPlant(aloeVera);
        mySpecimensNoteBook.addPlant(amaryllis);
        mySpecimensNoteBook.addPlant(pine);
        mySpecimensNoteBook.addPlant(bunnyEarCactus);
        mySpecimensNoteBook.addPlant(coralCactus);

        mySpecimensNoteBook.addAnimal(leon);
        mySpecimensNoteBook.addAnimal(polarBear);
        mySpecimensNoteBook.addAnimal(hyena);
        mySpecimensNoteBook.addAnimal(eagle);
        mySpecimensNoteBook.addAnimal(civet);
        mySpecimensNoteBook.addAnimal(alpaca);
        mySpecimensNoteBook.addAnimal(panda);
        mySpecimensNoteBook.addAnimal(raccoon);
        mySpecimensNoteBook.addAnimal(bear);

        mySpecimensNoteBook.printNotebook();

        System.out.println("*************** Sorted Animals and Plants *****************");
        mySpecimensNoteBook.sortAllAnimalsByName();
        mySpecimensNoteBook.sortAllPlantsByName();
        mySpecimensNoteBook.printNotebook();

        System.out.println("************* Sorted Animals and Plants (By height) **********");
        mySpecimensNoteBook.sortAllAnimalsByHeight();
        mySpecimensNoteBook.sortAllPlantsByHeight();
        mySpecimensNoteBook.printNotebook();

        System.out.println("*************** Heavy Animals *************************");
        mySpecimensNoteBook.printHeavyAnimalsCount();

        System.out.println("***************** Tall Animals **********************");
        mySpecimensNoteBook.printTallAnimalsCount();

        mySpecimensNoteBook.getCarnivores();
    }
}

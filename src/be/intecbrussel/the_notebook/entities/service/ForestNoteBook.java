package be.intecbrussel.the_notebook.entities.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ForestNoteBook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int AnimalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return AnimalCount;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public void addAnimal(Animal animal){
        if (animal != null && !animals.contains(animal)) {
            animals.add(animal);
            clasifyAnimal(animal);
            AnimalCount++;
        } else
            System.out.println("This animal already exist in the list!");
    }

    public void clasifyAnimal(Animal animal){
        if (animal instanceof Carnivore) carnivores.add((Carnivore) animal);
        if (animal instanceof Herbivore) herbivores.add((Herbivore) animal);
        if (animal instanceof Omnivore) omnivores.add((Omnivore) animal);
    }

    public void addPlant(Plant plant){
        if (plant != null && !plants.contains(plant)) {
            plants.add(plant);
            plantCount++;
        } else
            System.out.println("This animal already exist in the list!");
    }


    public void printNotebook(){
        System.out.println("************************* Animals: ******************************\n");
        animals.forEach(System.out::println);
        System.out.println("************************** Plants: ******************************\n");
        plants.forEach(System.out::println);
    }

    public void sortAllAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortAllPlantsByName(){
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortAllPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight));
    }

    public void sortAllAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void printHeavyAnimalsCount(){
        animals.stream().filter(animal -> animal.getWeight() > 50).forEach(System.out::println);

    }


    public void printTallAnimalsCount() {
        animals.stream().filter(animal -> animal.getHeight() > 1).forEach(System.out::println);
    }
}

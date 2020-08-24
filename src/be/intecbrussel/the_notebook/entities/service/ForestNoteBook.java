package be.intecbrussel.the_notebook.entities.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

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
        return plantCount = animals.size();
    }

    public int getAnimalCount() {
        return AnimalCount = animals.size();
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
        if (!animals.equals(animal))
            animals.add(animal);
        else
            System.out.println("This animal already exist in the list!");
    }

    public void addPlant(Plant plant){
        Comparator comparable = new Comparator<>();
        plants.add(plant);
    }

    public void printNotebook(){
        System.out.println("************************* Animals: ******************************\n");
        animals.forEach(System.out::println);
        System.out.println("************************** Plants: ******************************\n");
        plants.forEach(System.out::println);
    }

    public void sortAllAnimalsByName(){
        Comparator<Animal> byName =
                Comparator.comparing(Animal::getName);
        animals.sort(byName);
    }

    public void sortAllPlantsByName(){
        Comparator<Plant> byName =
                Comparator.comparing(Plant::getName);
        plants.sort(byName);
    }

    public void sortAllPlantsByHeight(){
        Comparator<Plant> byHeight =
                Comparator.comparing(Plant::getHeight);
        plants.sort(byHeight);
    }

    public void sortAllAnimalsByHeight() {
        Comparator<Animal> byHeight =
                Comparator.comparing(Animal::getHeight);
        animals.sort(byHeight);
    }

    public void printHeavyAnimalsCount(){
        animals.stream().filter(animal -> animal.getWeight() > 50).forEach(System.out::println);

    }


    public void printTallAnimalsCount() {
        animals.stream().filter(animal -> animal.getHeight() > 1).forEach(System.out::println);
    }
}

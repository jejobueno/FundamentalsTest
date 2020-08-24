package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet = new HashSet<>();

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    private void printDiet(){
        for (Plant plant : plantDiet) {
            System.out.println(plant.getName());
        }
    }

    @Override
    public String toString() {
        return "Herbivore{" + "\n" +
                "Name: " + getName() + "\n" +
                "Weight: " + getWeight() + "m\n" +
                "Height: " + getHeight()+ "m\n" +
                "Length: " + getLength() + "m\n" +
                "plantDiet=" + plantDiet + "\n" +
                '}';
    }
}

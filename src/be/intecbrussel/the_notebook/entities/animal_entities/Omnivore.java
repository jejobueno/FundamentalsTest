package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import com.sun.source.tree.LiteralTree;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet = new HashSet<Plant>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant){
        if (!plantDiet.equals(plant))
            plantDiet.add(plant);
        else
            System.out.println("This plant already exist in the diet!");
    }

    public void printDiet() {
        for (Plant plant : plantDiet) {
            System.out.println(plant.getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder diet = new StringBuilder();
        for (Plant plant : plantDiet) diet.append(plant.getName() + ", ");

        return "Omnivore{" + "\n" +
                "Name: " + getName() + "\n" +
                "Weight: " + getWeight() + "m\n" +
                "Height: " + getHeight()+ "m\n" +
                "Length: " + getLength() + "m\n" +
                "PlantDiet: " + diet + "\n" +
                "MaxFoodSize: " + maxFoodSize + "\n" +
                '}';
    }
}

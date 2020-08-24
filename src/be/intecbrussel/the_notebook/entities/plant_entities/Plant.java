package be.intecbrussel.the_notebook.entities.plant_entities;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;

public class Plant {

    private String name;
    private double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean equals(Object o) {
        return (o instanceof Plant) && (((Plant) o).name).equals(this.getName());
    }
}

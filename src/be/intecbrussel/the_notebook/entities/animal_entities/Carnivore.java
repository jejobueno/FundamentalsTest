package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal {

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" + "\n" +
                "Name: " + getName() + "\n" +
                "Weight: " + getWeight() + "m\n" +
                "Height: " + getHeight()+ "m\n" +
                "Length: " + getLength() + "m\n" +
                "MaxFoodSize:" + maxFoodSize + "\n" +
                '}';
    }
}

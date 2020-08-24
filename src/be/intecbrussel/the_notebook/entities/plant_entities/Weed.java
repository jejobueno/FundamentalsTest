package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    private double area;

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Weed{" + "\n" +
                "Name: " + getName() + "\n" +
                "Height: " + getHeight() + "m\n" +
                "Area: " + area + "\n" +
                '}';
    }
}

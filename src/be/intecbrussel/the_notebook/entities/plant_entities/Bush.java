package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, LeafType leafType) {
        super(name);
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush{" + "\n" +
                "Name: " + getName() + "\n" +
                "Height: " + getHeight() + "m\n" +
                "Fruit: " + fruit + "\n" +
                "LeafType: " + leafType + "\n" +
                '}';
    }
}

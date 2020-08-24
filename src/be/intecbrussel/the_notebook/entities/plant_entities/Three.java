package be.intecbrussel.the_notebook.entities.plant_entities;

public class Three extends Plant {

    private LeafType leafType;

    public Three(String name) {
        super(name);
    }

    public Three(String name, LeafType leafType) {
        super(name);
        this.leafType = leafType;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" + "\n" +
                "Name: " + getName() + "\n" +
                "Height: " + getHeight() + "\n" +
                "leafType: " + leafType + "\n" +
                '}';
    }
}

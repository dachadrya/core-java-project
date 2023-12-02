package typeOfInheritance.multiLevel;

public class Animal {
    private int numberOfLegs;
    private HabitatType habitat;
    private boolean isMultiCellular;

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setHabitat(HabitatType habitat) {
        this.habitat= habitat;
    }

    public HabitatType getHabitat() {
        return habitat;
    }

    public void setMultiCellular(boolean isMultiCellular) {
        this.isMultiCellular = isMultiCellular;
    }

    public boolean getMultiCellular() {
        return isMultiCellular;
    }
}

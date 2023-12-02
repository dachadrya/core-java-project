package typeOfInheritance.multiLevel;

public class Dog extends Animal {
    private boolean bark;
    private String breed;

    public void setBark(boolean bark) {
        this.bark = bark;
    }

    public boolean isBark() {
        return bark;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

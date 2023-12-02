package typeOfInheritance.multiLevel;

public class AnimalApplication {
    public static void main(String[] args) {
        BabyDog myDog =new BabyDog();
        myDog.setNumberOfLegs(4);
        int numberOfLegs=myDog.getNumberOfLegs();
        System.out.println(numberOfLegs);
    }
}

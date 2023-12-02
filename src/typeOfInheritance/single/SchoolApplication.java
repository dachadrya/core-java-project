package typeOfInheritance.single;

import oopconcept.Gender;


public class SchoolApplication {
    public static void main(String[] args) {
        Student missRita = new Student();
        missRita.setGender(Gender.FEMALE);
        System.out.println(missRita.getGender());


    }
}

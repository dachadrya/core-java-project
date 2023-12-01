package oopconcept.inheritance;

import oopconcept.Gender;

public class SchoolApplication {
    public static void main(String[] args) {
    Teacher missRita = new Teacher();
    missRita.setGender(Gender.FEMALE);
    System.out.println(missRita.getGender());


    }
}

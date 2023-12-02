package typeOfInheritance.hierarchical;

import oopconcept.Gender;
import typeOfInheritance.hierarchical.Teacher;

public class SchoolApplication {
    public static void main(String[] args) {
    Teacher missRita = new Teacher();
    missRita.setGender(Gender.FEMALE);
    System.out.println(missRita.getGender());


    }
}

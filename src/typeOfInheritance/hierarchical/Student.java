package typeOfInheritance.hierarchical;

import typeOfInheritance.hierarchical.Person;

public class Student extends Person {
    private String grade;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

package typeOfInheritance.single;

import typeOfInheritance.single.Person;
/* when a class inherit another class, it is called single inheritance */
public class Student extends Person {
    private String grade;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

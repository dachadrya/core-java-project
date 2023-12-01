package oopconcept.inheritance;

public class Teacher extends Person{
private String academicQualification;

    public void setAcademicQualification(String academicQualification) {
        this.academicQualification = academicQualification;
    }

    public String getAcademicQualification() {
        return academicQualification;
    }
}

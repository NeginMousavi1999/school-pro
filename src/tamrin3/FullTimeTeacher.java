package tamrin3;

import tamrin3.enums.Degree;
import tamrin3.enums.TeacherType;

import java.util.Set;

public class FullTimeTeacher extends Teacher {
    private double baseSalary;

    public FullTimeTeacher(String name, String lastName, String personalNumber, Degree degree, Set<School> school,
                           Integer experienceYear, Set<Course> course, int age, double baseSalary) {
        super(name, lastName, personalNumber, degree, school, experienceYear, course, age);
        this.baseSalary = baseSalary;
        this.setType(TeacherType.FULL_TIME);
        this.setSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public Double calculateSalary() {
        return baseSalary - super.calculateInsurance(baseSalary) - super.calculateTax(baseSalary);
    }

    @Override
    public String toString() {
        return "FullTimeTeacher{" +
                "name='" + this.getName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", personalNumber='" + this.getPersonalNumber() + '\'' +
                ", degree=" + this.getDegree().toString() +
                ", experienceYear=" + this.getExperienceYear() +
                ", age=" + this.getAge() +
                ", Salary=" + this.printSalary() +
                '}';
    }
}

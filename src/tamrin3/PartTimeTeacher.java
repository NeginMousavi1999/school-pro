package tamrin3;

import tamrin3.enums.Degree;
import tamrin3.enums.TeacherType;

import java.util.Set;

public class PartTimeTeacher extends Teacher {
    private int hourlySalary;
    private int hourPerMonth;

/*    public PartTimeTeacher(String name, String lastName, String personalCode, int hourPerMonth, int hourlySalary) {
        super(name, lastName, personalCode);
        this.hourlySalary = hourlySalary;
        this.hourPerMonth = hourPerMonth;
    }*/

    public PartTimeTeacher(String name, String lastName, String personalNumber, Degree degree, Set<School> school,
                           Integer experienceYear, Set<Course> course, int age, int hourlySalary, int hourPerMonth) {
        super(name, lastName, personalNumber, degree, school, experienceYear, course, age);
        this.hourlySalary = hourlySalary;
        this.hourPerMonth = hourPerMonth;
        this.setType(TeacherType.PART_TIME);
        this.setSalary(hourlySalary * hourPerMonth);
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHourPerMonth() {
        return hourPerMonth;
    }

    public void setHourPerMonth(int hourPerMonth) {
        this.hourPerMonth = hourPerMonth;
    }

    @Override
    public Double calculateSalary() {
        double baseSalary = hourlySalary * hourPerMonth;
        return baseSalary - super.calculateInsurance(baseSalary) - super.calculateTax(baseSalary);
    }

    @Override
    public String toString() {
        return "PartTimeTeacher{" +
                "name='" + this.getName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", personalNumber='" + this.getPersonalNumber() + '\'' +
                ", degree=" + this.getDegree().toString() +
                ", experienceYear=" + this.getExperienceYear() +
                ", age=" + this.getName() +
                ", hourlySalary=" + hourlySalary +
                ", hourPerMonth=" + hourPerMonth +
                '}';
    }
}

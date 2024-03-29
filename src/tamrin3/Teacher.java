package tamrin3;

import tamrin3.enums.Degree;
import tamrin3.enums.TeacherType;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Teacher {
    private String name;
    private String lastName;
    private String personalNumber;
    private Degree degree; //مدرک معلم
    private Set<School> school;
    private Integer experienceYear;
    private Set<Course> course = new HashSet<>();
    private int age;
    private TeacherType type;  // نوع معلم : تمام وقت و پاره وقت
    private double salary;

    public Teacher(String name, String lastName, String personalNumber, Degree degree, Set<School> school, Integer experienceYear,
                   Set<Course> course, int age) {
        this.name = name;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
        this.degree = degree;
        this.school = school;
        this.experienceYear = experienceYear;
        this.course = course;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public void setSchool(Set<School> school) {
        this.school = school;
    }

    public void setExperienceYear(Integer experienceYear) {
        this.experienceYear = experienceYear;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(TeacherType type) {
        this.type = type;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public Degree getDegree() {
        return degree;
    }

    public Set<School> getSchool() {
        return school;
    }

    public Integer getExperienceYear() {
        return experienceYear;
    }

    public Set<Course> getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public TeacherType getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

    public abstract Double calculateSalary();

    protected final Double calculateTax(Double salary) {

        if (salary < 2_800_000) {
            return 0D;
        }
        if (salary < 4_500_000) {
            return salary * 0.1;
        }
        if (salary < 8_500_000) {
            return salary * 0.15;
        }
        if (salary < 12_500_000) {
            return salary * 0.2;
        }
        return salary * 0.25;
    }

    protected final Double calculateInsurance(Double salary) {
        return salary * 0.07;
    }

    protected String printSalary() {
        NumberFormat formatter = new DecimalFormat("");
        return formatter.format(this.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return name.equals(teacher.name) &&
                lastName.equals(teacher.lastName) &&
                personalNumber.equals(teacher.personalNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, personalNumber);
    }
}

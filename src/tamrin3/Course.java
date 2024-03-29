package tamrin3;

import java.util.Objects;

public class Course {
    private String name;
    private int courseNumber;

    public Course(String name, int courseNumber) {
        this.name = name;
        this.courseNumber = courseNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getName() {
        return name;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return courseNumber == course.courseNumber &&
                name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courseNumber);
    }

    @Override
    public String toString() {
        return "{" + name + ": " + courseNumber + '}';
    }
}

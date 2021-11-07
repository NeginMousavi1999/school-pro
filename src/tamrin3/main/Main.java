package tamrin3.main;

import tamrin3.Course;
import tamrin3.School;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

/*        Course course = new Course("math", 1);
        Course course1 = new Course("computer", 2);
        Course course2 = new Course("physic", 3);
        Course course3 = new Course("history", 4);
        Course course4 = new Course("art", 5);


        School school =  new School("maktab", 1);
        School school1 = new School("madani", 2);
        School school2 = new School("alavi", 3);
        School school3 = new School("razavi", 3);
        School school4 = new School("jalal", 1);
        School school5 = new School("diba", 1);*/

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("math", 1));
        courses.add(new Course("computer", 2));
        courses.add(new Course("physic", 3));
        courses.add(new Course("history", 4));
        courses.add(new Course("art", 5));

        List<School> schools = new ArrayList<>();
        schools.add(new School("maktab", 1));
        schools.add(new School("madani", 2));
        schools.add(new School("alavi", 3));
        schools.add(new School("razavi", 3));
        schools.add(new School("jalal", 1));
        schools.add(new School("diba", 1));

    }

}

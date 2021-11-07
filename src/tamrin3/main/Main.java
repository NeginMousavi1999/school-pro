package tamrin3.main;

import tamrin3.Course;
import tamrin3.School;
import tamrin3.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

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

        TeacherService teacherService = new TeacherService();
        List<Teacher> teachers = teacherService.getTeachers();
        try {
            teacherService.addNewSchool(teachers.get(0), schools.get(0));
            teacherService.addNewSchool(teachers.get(0), schools.get(0));
            teacherService.addNewCourse(teachers.get(0), courses.get(0));
            teacherService.addNewCourse(teachers.get(0), courses.get(0));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            printStar();
        }

        try {
            teacherService.addNewCourse(teachers.get(0), courses.get(0));
            teacherService.addNewCourse(teachers.get(0), courses.get(0));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            printStar();
        }

        System.out.println("all schools for " + teachers.get(0) + " is:");
        teachers.get(0).getSchool().forEach(System.out::println);
        System.out.println("and courses:");
        teachers.get(0).getCourse().forEach(System.out::println);
        printStar();

        System.out.println("AVG of full time : " + teacherService.getFullTimeAvrSalary() + "\nmore than avg:");
        teacherService.getTeachersWithHigherThanAverageFullTimeTeachersSalaries().forEach(System.out::println);





























/*        while (true) {
            System.out.println("1.add new teacher\n2.exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    break;
                default:
                    printInvalidInput();
            }
        }*/

    }

    /*    private static void addTeacher() {
            System.out.println("enter name:");
        }

        private static void printInvalidInput() {
            System.out.println("invalid input");
        }*/
    private static void printStar() {
        System.out.println("***************************************************************");
    }
}

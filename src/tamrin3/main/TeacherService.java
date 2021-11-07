package tamrin3.main;

import tamrin3.*;
import tamrin3.enums.Degree;
import tamrin3.enums.TeacherType;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Negin Mousavi
 */
public class TeacherService {
    List<Teacher> teachers = new ArrayList<>();

    public TeacherService() {
        teachers.add(new PartTimeTeacher("negin", "mousavi", "0021899436", Degree.BS, new HashSet<>(),
                2, new HashSet<>(), 22, 120, 120));
        teachers.add(new PartTimeTeacher("negarin", "mousavi", "0021234567", Degree.BS, new HashSet<>(),
                0, new HashSet<>(), 14, 40, 50));
        teachers.add(new FullTimeTeacher("nayer", "koosheshtabar", "1111234567", Degree.MA, new HashSet<>(),
                28, new HashSet<>(), 49, 6200000));
        teachers.add(new FullTimeTeacher("sahar", "kaveh", "1121234567", Degree.BS, new HashSet<>(),
                15, new HashSet<>(), 38, 5200000));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addNewTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Set<School> addNewSchool(Teacher teacher, School school) { // اینجا لازم نیست که آپشنال بذارم چون مطمئنم که نال برنمیگردونه
        Set<School> teacherSchools = teacher.getSchool();
        if (teacherSchools.contains(school))
            throw new RuntimeException("this teacher already has this school");
        teacherSchools.add(school);
        return teacherSchools;
    }

    public Set<Course> addNewCourse(Teacher teacher, Course course) { //اینجا هم مثل بالا
        Set<Course> teacherCourses = teacher.getCourse();
        if (teacherCourses.contains(course))
            throw new RuntimeException("this teacher already has this course");
        teacherCourses.add(course);
        return teacherCourses;
    }

    public Double getAllAvrSalary() {
        Double sum = teachers.stream().map(Teacher::getSalary).reduce(0D, Double::sum);
        int count = teachers.size();
        return sum / count;
    }

    public Double getFullTimeAvrSalary() {
        Double sum = teachers.stream().filter(t -> t.getType().equals(TeacherType.FULL_TIME)).map(Teacher::getSalary)
                .reduce(0D, Double::sum);
        int count = (int) teachers.stream().filter(t -> t.getType().equals(TeacherType.FULL_TIME)).count();
        return sum / count;
    }

    public List<Teacher> getTeachersWithHigherThanAverageFullTimeTeachersSalaries() {
        return teachers.stream().filter(t -> t.getSalary() > getFullTimeAvrSalary()).collect(Collectors.toList());
    }
}

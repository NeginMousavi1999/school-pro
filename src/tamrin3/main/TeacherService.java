package tamrin3.main;

import tamrin3.FullTimeTeacher;
import tamrin3.PartTimeTeacher;
import tamrin3.School;
import tamrin3.Teacher;
import tamrin3.enums.Degree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Negin Mousavi
 */
public class TeacherService {
    List<Teacher> teachers = new ArrayList<>();

    public TeacherService() {
        teachers.add(new PartTimeTeacher("negin", "mousavi", "0021899436", Degree.BS, new HashSet<>(),
                2, new HashSet<>(), 22, 100, 100));
        teachers.add(new PartTimeTeacher("negarin", "mousavi", "0021234567", Degree.BS, new HashSet<>(),
                0, new HashSet<>(), 14, 120, 50));
        teachers.add(new FullTimeTeacher("nayer", "koosheshtabar", "1111234567", Degree.MA, new HashSet<>(),
                28, new HashSet<>(), 49, 6200000));
        teachers.add(new FullTimeTeacher("sahar", "kaveh", "1121234567", Degree.BS, new HashSet<>(),
                15, new HashSet<>(), 38, 5200000));
    }

    public void addNewTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Set<School> addNewSchool(Teacher teacher, School school) { //اینجا لازم نیست که آپشنال بذارم چون مطمئنم که نال برنمیگردونه
        Set<School> teacherSchools = teacher.getSchool();
        if (teacherSchools.contains(school))
            throw new RuntimeException("this teacher already has this school");
        teacherSchools.add(school);
        return teacherSchools;
    }
}

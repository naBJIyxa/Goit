package Module3.Task3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    //Setters

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    //Getters

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }
}

/*
    Создать следующую структуру классов.

        Класс Course с полями:
        Date startDate,
        String name,
        int hoursDuration,
        String teacherName.
        Создайте 2 конструктора с аргументами
        startDate, name;
        hourseDuration, name, teacherName.

        Класс Student с полями:
        String firstName,
        String lastName,
        int group,
        Course[] coursesTaken,
        int age.
        С 2 конструкторами с аргументами
        firstName, lastName, group;
        lastName, coursesTaken.

        CollegeStudent унаследован от Student.
        Дополнительные поля: String collegeName, int rating, long id.
        Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.

        Class SpecialStudent унаследован от CollegeStudent.
        Дополнительные поля long secretKey, String email.
        Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.

        Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
        Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
        У вас должно быть 13 объектов в классе Solution.



5  Courses, 2 Student , 3 CollegeStudent , 3  SpecialStudent =13
 */
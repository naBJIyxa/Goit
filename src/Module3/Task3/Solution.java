package Module3.Task3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Date date = new Date();

        Course[] coursesTaken = new Course[5];

        Course courseJava = new Course("Java", 50, "Teacher-Java");
        Course coursePhp = new Course("Php", 40, "Teacher-Php");
        Course courseMysql = new Course("Mysql", 30, "Teacher-Mysql");
        Course courseJavascript = new Course(date, "John");
        Course courseSass = new Course(date, "Bob");

        coursesTaken[0] = courseJava;
        coursesTaken[1] = coursePhp;
        coursesTaken[2] = courseMysql;
        coursesTaken[3] = courseJavascript;
        coursesTaken[4] = courseSass;

        Student student1 = new Student("Red", "Wilson", 55);
        Student student2 = new Student("Ron", coursesTaken);

        CollegeStudent collegeStudent = new CollegeStudent("Don", coursesTaken);
        CollegeStudent collegeStudent1 = new CollegeStudent("Michel", "Toy", 87);
        CollegeStudent collegeStudent2 = new CollegeStudent("Robinson", coursesTaken, "GoIT", 80, 1234567890);

        SpecialStudent specialStudent = new SpecialStudent("Bean", coursesTaken);
        SpecialStudent specialStudent1 = new SpecialStudent("Holly", coursesTaken, "GoIT", 99, 987654321);
        SpecialStudent specialStudent2 = new SpecialStudent(983456938);

    }

}

/*

Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
        Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
        У вас должно быть 13 объектов в классе Solution.

5  Courses, 2 Student , 3 CollegeStudent , 3  SpecialStudent = 13 объектов

 */

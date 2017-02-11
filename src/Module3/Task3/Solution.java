package Module3.Task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Course courseJava = new Course("Java", 50, "Teacher-Java");
        Course coursePhp = new Course("Php", 40, "Teacher-Php");
        Course courseMysql = new Course("Mysql", 30, "Teacher-Mysql");
        Course courseJavascript = new Course("Javascript", 20, "Teacher-Javascript");
        Course courseSass = new Course("Sass", 10, "Teacher-Sass");

        Student student1 = new Student("Иван", "Иванов", 5);
        Student student2 = new Student("Петров", new Course(),"Вася");

        //SpecialStudent specialStudent = new SpecialStudent();

        //CollegeStudent collegeStudent = new CollegeStudent("Жорик", );



    }

}

/*

Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
        Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
        У вас должно быть 13 объектов в классе Solution.



5  Courses, 2 Student , 3 CollegeStudent , 3  SpecialStudent =13

 */

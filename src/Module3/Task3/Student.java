package Module3.Task3;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    protected Course[] coursesTaken;
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public void setCoursesTaken(Course... coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }
}

/*

 Класс Student с полями:
        String firstName,
        String lastName,
        int group,
        Course[] coursesTaken,
        int age.
        С 2 конструкторами с аргументами
        firstName, lastName, group;
        lastName, coursesTaken.

 */
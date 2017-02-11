package Module3.Task3;

public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(lastName, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}


/*

CollegeStudent унаследован от Student.
        Дополнительные поля: String collegeName, int rating, long id.
        Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.

 */
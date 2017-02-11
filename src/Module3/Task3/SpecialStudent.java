package Module3.Task3;

public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(lastName, coursesTaken, collegeName, rating, id);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, long secretKey) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
    }

    //Setters

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Getters

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }
}

/*

Class SpecialStudent унаследован от CollegeStudent.
        Дополнительные поля long secretKey, String email.
        Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.

 */

package Module3.Task3;

public class SpecialStudent extends CollegeStudent {

    long secretKey;
    String email;

    public SpecialStudent(String lastName, Course[] coursesTaken, long secretKey, String email) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }
}

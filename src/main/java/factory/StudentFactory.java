package factory;

public class StudentFactory {

    public static Student createStudent(String studentType) {
        if (studentType.equalsIgnoreCase("graduate")) {
            return new GraduateStudent();
        } else if (studentType.equalsIgnoreCase("undergraduate")) {
            return new UndergraduateStudent();
        } else {
            return null;
        }
    }
}

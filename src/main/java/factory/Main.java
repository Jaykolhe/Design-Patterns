package factory;

public class Main {

    public static void main(String[] args) {

        Student graduate = StudentFactory
                        .createStudent("Graduate");
        graduate.getDetails();

        Student undergraduate = StudentFactory
                        .createStudent("Undergraduate");
        undergraduate.getDetails();

    }
}

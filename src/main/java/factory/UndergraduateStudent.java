package factory;

public class UndergraduateStudent implements Student{
    @Override
    public void getDetails() {
        System.out.println("Undergraduate Student: Pursuing bachelor's degree.");
    }
}

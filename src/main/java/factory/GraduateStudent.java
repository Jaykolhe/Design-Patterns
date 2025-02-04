package factory;

public class GraduateStudent implements Student{
    @Override
    public void getDetails() {
        System.out.println("Graduate Student: Pursuing post-graduate degree.");
    }
}

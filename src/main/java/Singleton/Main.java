package Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        System.out.println(s1.getWater(20));
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
}

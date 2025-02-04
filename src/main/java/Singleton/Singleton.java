package Singleton;
public class Singleton {
    //Eager Initialization Singleton
   // private static Singleton instance = new Singleton();
    //Lazy
    private static Singleton instance;

    private static int WaterTank = 100;

    private Singleton() {

    }
    public static  Singleton getInstance() {

        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
    public int getWater(int capacity) {
        return WaterTank-capacity;
    }


}

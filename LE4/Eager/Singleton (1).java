public class Singleton {
    
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void displayMessage() {
        System.out.println("Eager Singleton instance accessed!");
    }
}





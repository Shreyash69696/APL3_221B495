public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.displayMessage();
        
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton); 
    }
}
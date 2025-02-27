public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton singleton = Singleton.getInstance();
            singleton.displayMessage();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}

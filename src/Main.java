public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello"));
        thread.join();

        System.out.println("Hello world!");
    }
}
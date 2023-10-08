public class Main {
    public static void main(String[] args) {
        // Create multiple order objects
        Order order1 = new Order(1, "Alice", 50.0);
        Order order2 = new Order(2, "Bob", 75.0);
        Order order3 = new Order(3, "Charlie", 30.0);

        // Create threads and associate them with order objects
        Thread thread1 = new Thread(order1);
        Thread thread2 = new Thread(order2);
        Thread thread3 = new Thread(order3);

        // Start order processing threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all order threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All orders have been processed.");
    }
}
import java.util.Random;

public class Order implements Runnable {
    private int orderId;
    private String customerName;
    private double totalAmount;

    public Order(int orderId, String customerName, double totalAmount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public void processOrder(){
        System.out.println("Processing Order #" + orderId + " for " + customerName);
        try {
            // Simulate order processing time between 1 and 5 seconds
            Random random = new Random();
            int processingTime = random.nextInt(5) + 1;
            Thread.sleep(processingTime * 1000);
        } catch (InterruptedException e) {
            System.out.println("Order #" + orderId + " processing interrupted.");
        }
        System.out.println("Order #" + orderId + " processing completed.");
    }

    @Override
    public void run() {
        processOrder();
    }
}

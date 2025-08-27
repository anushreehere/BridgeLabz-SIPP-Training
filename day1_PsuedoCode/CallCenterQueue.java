// CallCenterQueue.java
import java.util.LinkedList;
import java.util.Queue;

class Customer {
    String name;
    boolean emergency;

    Customer(String name, boolean emergency) {
        this.name = name;
        this.emergency = emergency;
    }

    @Override
    public String toString() {
        return (emergency ? "[EMERGENCY] " : "") + name;
    }
}

public class CallCenterQueue {
    public static void main(String[] args) {
        Queue<Customer> normalQueue = new LinkedList<>();
        Queue<Customer> emergencyQueue = new LinkedList<>();

        normalQueue.add(new Customer("Alice", false));
        normalQueue.add(new Customer("Bob", false));
        emergencyQueue.add(new Customer("Charlie", true));

        while (!emergencyQueue.isEmpty() || !normalQueue.isEmpty()) {
            if (!emergencyQueue.isEmpty()) {
                System.out.println("Serving: " + emergencyQueue.poll());
            } else {
                System.out.println("Serving: " + normalQueue.poll());
            }
        }
    }
}

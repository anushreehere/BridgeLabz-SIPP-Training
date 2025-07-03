class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1500.0;

    CarRental() {
        this("Unknown", "Standard", 1);
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: ₹" + calculateTotalCost());
    }
}

public class CarRentalTest {
    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Anjali", "Honda City", 5);

        defaultRental.display();
        customRental.display();
    }
}


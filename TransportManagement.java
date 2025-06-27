import java.util.Random;
import java.util.Scanner;

class Bus {
    String route;
    String driverName;
    int busNumber;
    int totalSeats;
    int availableSeats;
    String timing;

    public Bus(String route, String driverName, int busNumber, int totalSeats, String timing) {
        this.route = route;
        this.driverName = driverName;
        this.busNumber = busNumber;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.timing = timing;
    }

    public void displayBusInfo() {
        System.out.println("\nBus Number: " + busNumber);
        System.out.println("Route: " + route);
        System.out.println("Driver: " + driverName);
        System.out.println("Timing: " + timing);
        System.out.println("Available Seats: " + availableSeats + "/" + totalSeats);
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat booked successfully! Remaining seats: " + availableSeats);
        } else {
            System.out.println("No seats available.");
        }
    }

    public void cancelSeat() {
        if (availableSeats < totalSeats) {
            availableSeats++;
            System.out.println("Seat canceled successfully! Available seats: " + availableSeats);
        } else {
            System.out.println("All seats are already available.");
        }
    }
}

public class TransportManagement {
    Scanner scanner = new Scanner(System.in);
    Bus[] buses;

    public TransportManagement() {
        int[] busNumbers = {43, 25, 62, 57, 30, 59, 52, 64, 55, 41}; // Unique bus numbers
        buses = new Bus[]{
            new Bus("Route to London Road", "Harry Potter", busNumbers[0], 30, "3:00 AM"),
            new Bus("Route to Dubai Kuruku Sandhu", "Thomas Shelby", busNumbers[1], 42, "3:30 AM"),
            new Bus("Route to Malasiya Mount Road", "Deadpool", busNumbers[2], 45, "4:00 AM"),
            new Bus("Route to Singapore Silk Street", "Jack Sparrow", busNumbers[3], 44, "4:30 AM"),
            new Bus("Route to Brazil Kadugal", "Dracula", busNumbers[4], 37, "5:00 AM"),
            new Bus("Route to Paris Corner", "Ragnarok", busNumbers[5], 44, "5:30 AM"),
            new Bus("Route to American White House", "Pablo Escobar", busNumbers[6], 45, "6:00 AM"),
            new Bus("Route to North Korean Embassy", "Jon Snow", busNumbers[7], 37, "6:30 AM"),
            new Bus("Route to China Town", "John Wick", busNumbers[8], 45, "6:45 AM"),
            new Bus("Route to Pandora", "Peter Parker", busNumbers[9], 39, "7:00 AM")
        };
    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Show All Bus Details");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Check Seat Availability");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Bus bus : buses) {
                        bus.displayBusInfo();
                    }
                    break;
                case 2:
                    bookSeat();
                    break;
                case 3:
                    cancelSeat();
                    break;
                case 4:
                    checkAvailability();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void bookSeat() {
        System.out.print("Enter Bus Number: ");
        int busNum = scanner.nextInt();
        for (Bus bus : buses) {
            if (bus.busNumber == busNum) {
                bus.bookSeat();
                return;
            }
        }
        System.out.println("Bus not found.");
    }

    private void cancelSeat() {
        System.out.print("Enter Bus Number: ");
        int busNum = scanner.nextInt();
        for (Bus bus : buses) {
            if (bus.busNumber == busNum) {
                bus.cancelSeat();
                return;
            }
        }
        System.out.println("Bus not found.");
    }

    private void checkAvailability() {
        System.out.print("Enter Bus Number: ");
        int busNum = scanner.nextInt();
        for (Bus bus : buses) {
            if (bus.busNumber == busNum) {
                bus.displayBusInfo();
                return;
            }
        }
        System.out.println("Bus not found.");
    }

    public static void main(String[] args) {
        TransportManagement transport = new TransportManagement();
        transport.menu();
    }
}
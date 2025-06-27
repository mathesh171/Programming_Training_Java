import java.util.Scanner;

class ParkingManagement {
    private int[] bikeSlots = {200, 500}; // [0] for Staff, [1] for Students
    private int carSlots = 150;
    private String[] studentBikeIDs = new String[500];
    private String[] staffBikeIDs = new String[200];
    private String[] carIDs = new String[150];

    private int bikeEntryCount = 0, carEntryCount = 0;
    private int bikeExitCount = 0, carExitCount = 0;

    Scanner scanner = new Scanner(System.in);

    public void showAvailableSlots() {
        System.out.println("\nAvailable Parking Slots:");
        System.out.println("Staff Bikes: " + bikeSlots[0] + " of 200");
        System.out.println("Student Bikes: " + bikeSlots[1] + " of 500");
        System.out.println("Car Parking: " + carSlots + " of 150");
    }

    public void parkBike(boolean isStaff) {
        int index = isStaff ? 0 : 1;
        if (bikeSlots[index] > 0) {
            System.out.print("Enter your ID: ");
            String id = scanner.next();
            if (isStaff) {
                staffBikeIDs[200 - bikeSlots[0]] = id;
            } else {
                studentBikeIDs[500 - bikeSlots[1]] = id;
            }
            bikeSlots[index]--;
            bikeEntryCount++;
            System.out.println((isStaff ? "Staff" : "Student") + " bike parked. Available slots: " + bikeSlots[index] + " of " + (isStaff ? 200 : 500));
        } else {
            System.out.println("No bike parking available for " + (isStaff ? "staff." : "students."));
        }
    }

    public void exitBike(boolean isStaff) {
        int index = isStaff ? 0 : 1;
        if (bikeSlots[index] < (isStaff ? 200 : 500)) {
            System.out.print("Enter your ID to exit: ");
            String id = scanner.next();
            boolean found = false;
            if (isStaff) {
                for (int i = 0; i < staffBikeIDs.length; i++) {
                    if (staffBikeIDs[i] != null && staffBikeIDs[i].equals(id)) {
                        staffBikeIDs[i] = null;
                        found = true;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < studentBikeIDs.length; i++) {
                    if (studentBikeIDs[i] != null && studentBikeIDs[i].equals(id)) {
                        studentBikeIDs[i] = null;
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                bikeSlots[index]++;
                bikeExitCount++;
                System.out.println((isStaff ? "Staff" : "Student") + " bike exited. Available slots: " + bikeSlots[index] + " of " + (isStaff ? 200 : 500));
            } else {
                System.out.println("Invalid ID. No bike found.");
            }
        } else {
            System.out.println("No bikes to exit.");
        }
    }

    public void parkCar() {
        if (carSlots > 0) {
            System.out.print("Enter your Car ID: ");
            String id = scanner.next();
            carIDs[150 - carSlots] = id;
            carSlots--;
            carEntryCount++;
            System.out.println("Car parked. Available slots: " + carSlots + " of 150");
        } else {
            System.out.println("No car parking available.");
        }
    }

    public void exitCar() {
        if (carSlots < 150) {
            System.out.print("Enter your Car ID to exit: ");
            String id = scanner.next();
            boolean found = false;
            for (int i = 0; i < carIDs.length; i++) {
                if (carIDs[i] != null && carIDs[i].equals(id)) {
                    carIDs[i] = null;
                    found = true;
                    break;
                }
            }
            if (found) {
                carSlots++;
                carExitCount++;
                System.out.println("Car exited. Available slots: " + carSlots + " of 150");
            } else {
                System.out.println("Invalid ID. No car found.");
            }
        } else {
            System.out.println("No cars to exit.");
        }
    }

    public void showCounts() {
        System.out.println("\nEntry & Exit Counts:");
        System.out.println("Bike Entries: " + bikeEntryCount + " | Exits: " + bikeExitCount);
        System.out.println("Car Entries: " + carEntryCount + " | Exits: " + carExitCount);
    }

    public void resetParking() {
        bikeSlots[0] = 200;
        bikeSlots[1] = 500;
        carSlots = 150;
        bikeEntryCount = carEntryCount = bikeExitCount = carExitCount = 0;
        studentBikeIDs = new String[500];
        staffBikeIDs = new String[200];
        carIDs = new String[150];
        System.out.println("Parking slots have been reset.");
    }

    public void showRoute() {
        System.out.println("\n🚦 College Parking Route:");
        System.out.println("Entry -> A-Block -> Staff Bike Parking (Slot 1 to 200) -> Turn Left");
        System.out.println("-> B-Block -> Student Bike Parking (Slot 201 to 700) -> Turn Right");
        System.out.println("-> C-Block -> Car Parking (Slot 701 to 850) -> Exit");
    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Park Student Bike");
            System.out.println("2. Park Staff Bike");
            System.out.println("3. Park Car");
            System.out.println("4. Exit Student Bike");
            System.out.println("5. Exit Staff Bike");
            System.out.println("6. Exit Car");
            System.out.println("7. Show Available Slots");
            System.out.println("8. Show Entry/Exit Counts");
            System.out.println("9. Show Parking Route");
            System.out.println("10. Reset Parking");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    parkBike(false);
                    break;
                case 2:
                    parkBike(true);
                    break;
                case 3:
                    parkCar();
                    break;
                case 4:
                    exitBike(false);
                    break;
                case 5:
                    exitBike(true);
                    break;
                case 6:
                    exitCar();
                    break;
                case 7:
                    showAvailableSlots();
                    break;
                case 8:
                    showCounts();
                    break;
                case 9:
                    showRoute();
                    break;
                case 10:
                    resetParking();
                    break;
                case 11:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        ParkingManagement parking = new ParkingManagement();
        parking.menu();
    }
}

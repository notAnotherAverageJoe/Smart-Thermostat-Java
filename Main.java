import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name for this unit: ");
        String homeNameString = scanner.nextLine();

        // Ask the user for the initial and target temperatures
        System.out.print("Enter the current temperature: ");
        int currentTemp = scanner.nextInt();

        System.out.print("Enter the target temperature: ");
        int targetTemp = scanner.nextInt();

        Thermostat mainThermostat = new Thermostat(homeNameString, currentTemp, targetTemp);

        // Create a Cooling object with the user-provided temperatures
        Cooling coolingElement = new Cooling(mainThermostat);
        Heating heatingElement = new Heating(mainThermostat);

        boolean hasPower = true;

        mainThermostat.status();
        int choice;

        while (hasPower) {
            System.out.println("Menu:");
            System.out.println("1. Edit Settings");
            System.out.println("2. Cooling");
            System.out.println("3. Heating");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Get user input
            choice = scanner.nextInt();
            System.out.println("\n\n");
            switch (choice) {
                case 1:
                    System.out.println("Edit settings selected\n");
                    mainThermostat.status();
                    break;
                case 2:
                    System.out.println("Cooling selected\n");
                    coolingElement.startCooling();
                    break;
                case 3:
                    System.out.println("Heating Selected");
                    heatingElement.startHeating();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");

            }

        }

        scanner.close();
    }

}

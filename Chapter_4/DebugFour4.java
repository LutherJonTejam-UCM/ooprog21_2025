import java.util.Scanner;
public class DebugFour4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter destination city: ");
        String destination = scanner.nextLine();

        System.out.print("Enter departure city (press enter to use default Atlanta): ");
        String departure = scanner.nextLine();

        System.out.print("Enter mode of transport (press enter to use default car): ");
        String mode = scanner.nextLine();

        DebugTrip trip;

        if (departure.isEmpty() && mode.isEmpty()) {
            trip = new DebugTrip(destination);
        } else if (mode.isEmpty()) {
            trip = new DebugTrip(destination, departure);
        } else {
            trip = new DebugTrip(destination, departure, mode);
        }

        System.out.println("Trip Details:");
        System.out.println("Destination: " + trip.getDestination());
        System.out.println("Departure: " + trip.getDepartureCity());
        System.out.println("Mode of transport: " + trip.getMode());

        scanner.close();
    }
}


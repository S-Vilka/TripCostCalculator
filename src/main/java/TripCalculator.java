import java.util.Scanner;

public class TripCalculator {

    public static double calculateTripCost(double distance, double fuelPricePerLiter) {
        final double fuelConsumptionPer100km = 5.0;
        double fuelNeeded = (distance / 100) * fuelConsumptionPer100km;
        return fuelNeeded * fuelPricePerLiter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance to travel in km: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPricePerLiter = scanner.nextDouble();

        double totalCost = calculateTripCost(distance, fuelPricePerLiter);

        System.out.printf("Total cost of the trip: €%.2f%n", totalCost);

        scanner.close();
    }
}
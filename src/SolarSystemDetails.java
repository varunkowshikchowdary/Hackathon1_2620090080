import java.util.Scanner;

public class SolarSystemDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Panel ID (integer): ");
            int panelId = scanner.nextInt();

        System.out.print("Enter Energy generated in kWh (decimal): ");
            double energyGenerated = scanner.nextDouble();

        System.out.print("Enter Number of solar panels (integer): ");
        int numberOfPanels = scanner.nextInt();

        System.out.print("Enter System status (character): ");
         char systemStatus = scanner.next().charAt(0);

        System.out.println("\n--- Rooftop Solar System Details ---");
           System.out.println("Panel ID: " + panelId);
         System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
         System.out.println("System Status: " + systemStatus);

        scanner.close();
    }
}
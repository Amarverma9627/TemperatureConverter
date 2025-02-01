import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature value and unit
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().charAt(0);  // Read the unit as a character
        
        double convertedTemperature;

        // Convert based on the unit provided by the user
        if (unit == 'C' || unit == 'c') {
            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println(temperature + " Celsius is " + convertedTemperature + " Fahrenheit.");
        } else if (unit == 'F' || unit == 'f') {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Celsius.");
        } else {
            System.out.println("Invalid unit entered! Please enter either 'C' for Celsius or 'F' for Fahrenheit.");
        }

        // Close the scanner
        scanner.close();
    }
}

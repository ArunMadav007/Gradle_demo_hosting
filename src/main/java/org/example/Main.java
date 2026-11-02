
package org.example;

public class Main {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        double result = celsiusToFahrenheit(25);

        System.out.println("Temperature in Fahrenheit: " + result);
    }
}

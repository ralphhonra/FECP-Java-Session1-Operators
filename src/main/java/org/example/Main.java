package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celsius: ");
        float inputtedCelsius = new Scanner(System.in).nextFloat();

        System.out.print("Temperature in Fahrenheit: " + String.format("%.2f", getFahrenheit(inputtedCelsius)));
    }

    public static float getFahrenheit(float inputtedCelsius) {
        return inputtedCelsius * (9/5.0f) + 32;
    }
}
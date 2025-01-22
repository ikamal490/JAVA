package MyPractice_code;

import java.util.Scanner;

/*
Convert Temperature
    Write a program to convert temperature from Celsius to Fahrenheit. Use the formula:
    Fahrenheit=(Celsius×9/5)+32

    Example Output:
    Enter temperature in Celsius: 25
    Temperature in Fahrenheit: 77.0
 */
public class _058_Medium_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        float temperature = sc.nextFloat();
        System.out.println("Temperature in Celsius is : "+temperature);
        System.out.println("Temperature in Fahrenheit: "+((temperature)*9/5+32));
    }
}

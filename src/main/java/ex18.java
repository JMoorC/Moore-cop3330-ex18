/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);
        Boolean toMetric = false;

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit. ");
        String choice = inScan.nextLine().toUpperCase();
        if (choice.equals("C") ){
            toMetric = true;
        }
        String out = (toMetric)? "fahrenheit" : "celsius";
        System.out.printf("Your choice: %s\nPlease enter the temperature in " + out + ": ", choice);
        int temp = inScan.nextInt();
        if (toMetric){
            temp = ( (temp - 32) * 5) / 9;
        }
        else{
            temp = ( (temp * 9) / 5) + 32;
        }
        out = (toMetric)? "celsius" : "fahrenheit";
        System.out.printf("The temperature in " + out + "is: %d", temp);
    }
}
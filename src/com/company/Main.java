package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today's temperature in fahrenheit?");
        Scanner scan = new Scanner(System.in);
        int temp = input.nextInt();
        System.out.println("Today's temperature in celsius is " + (temp-32)/1.8 );


    }
}

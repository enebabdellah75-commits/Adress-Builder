package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    private static String system;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        //Create a stringBuilder to store customer information
        StringBuilder address=new StringBuilder();


        // Ask for the customer's full name
        System.out.print(" please Enter your Full name: ");
        address.append(scanner.nextLine()).append("\n");



    }
}

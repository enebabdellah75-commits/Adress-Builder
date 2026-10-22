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

        // Billing address
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Shipping address
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();





    }
}

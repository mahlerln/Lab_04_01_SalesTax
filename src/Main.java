import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       

        System.out.print("What is the price of your purchase: ");
   double basePrice = 50;

double salesTax = 0.05 * basePrice;

        System.out.printf("The price is $" + basePrice);
System.out.printf(" The price of tax is $" +  salesTax);
System.out.printf(" The total price is $" + (basePrice + salesTax));



    }
    }
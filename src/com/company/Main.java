package com.company;

public class Main {

    // Swtich case til UI. Eller Scanner class.
    // Med udregning oveni ens UI valg.

    public static void main(String[] args) {

        // Selve udvalget / oversigten.

        System.out.println("");
        System.out.println("Discount rate:");
        System.out.println("");
        System.out.println("-------------");
        System.out.println("Order Value + Discount Rate:");
        System.out.println("-------------");
    OrderValue order1 = new OrderValue(1000, 3);
    System.out.println(order1);
    OrderValue order2 = new OrderValue(5000, 5);
    System.out.println(order2);
    OrderValue order3 = new OrderValue(7000, 7);
    System.out.println(order3);
    OrderValue order4 = new OrderValue(10000, 10);
    System.out.println(order4);
    OrderValue order5 = new OrderValue(50000, 15);
    System.out.println(order5);
    System.out.println("-------------");




    }
}

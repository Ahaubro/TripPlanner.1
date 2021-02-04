package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ArrayList<BeachTrip> beachList = new ArrayList<>();
        ArrayList<SkiTrip> skiList = new ArrayList<>();

        SkiTrip s1 = new SkiTrip("Tur til Alperne", "Østrig", 12, 12000);
        BeachTrip b1 = new BeachTrip("Tur til Maldiverne", "Maldiverne", 7,10000 );

        skiList.add(s1);
        beachList.add(b1);


        tripMenu(console, skiList, beachList);

    }

    public static void tripMenu(Scanner console, ArrayList<SkiTrip> skiList, ArrayList<BeachTrip> beachList) {
        int svar = 1;

        while(svar!=0) {
            System.out.println("Velcome to tripPlanner!");
            System.out.println("----------------------------");
            System.out.println("Tab 1 to create a ski trip");
            System.out.println("Tab 2 to create a beach trip");
            System.out.println("Tab 3 to see existing trips");
            System.out.println("Tab 0 to exit");
            svar = console.nextInt();

            switch(svar) {
                case 1:
                    System.out.println("Creating a trip it is");
                    createSkiTrip(console, skiList);
                    break;

                case 2:
                    System.out.println("Creating a beach trip it is");
                    createBeachTrip(console, beachList);
                    break;

                case 3:
                    System.out.println("Tab 1 to list all beach trips");
                    System.out.println("Tab 2 to list all ski trips");
                    int svar1 = console.nextInt();

                    switch(svar1) {
                        case 1:
                            System.out.println("List of all beach trips: ");
                            System.out.println(beachList);
                            break;

                        case 2:
                            System.out.println("List of all ski trips: ");
                            System.out.println(skiList);
                            break;


                    }


            }
        }
    }

    public static void createSkiTrip(Scanner console, ArrayList<SkiTrip> skiList) {
        System.out.print("Please enter trip title: ");
        String temp = console.nextLine();
        String t = console.nextLine();
        System.out.print("Please enter where you are going: ");
        //String temp1 = console.nextLine();
        String l = console.nextLine();
        System.out.print("Please enter the trips duration: ");
        int d = console.nextInt();
        System.out.print("Please enter the trips cost: ");
        int c = console.nextInt();

        SkiTrip s2 = new SkiTrip(t, l, d, c);
        System.out.println("Your latest trip: ");
        System.out.println(s2.toString());

        skiList.add(s2);

    }

    public static void createBeachTrip(Scanner console, ArrayList<BeachTrip> beachList) {
        System.out.print("Please enter trip title: ");
        String temp = console.nextLine();
        String t = console.nextLine();
        System.out.print("Please enter where you are going: ");
        String temp1 = console.nextLine();
        String l = console.nextLine();
        System.out.print("Please enter the trips duration: ");
        int d = console.nextInt();
        System.out.print("Please enter the trips cost: ");
        int c = console.nextInt();

        BeachTrip b2 = new BeachTrip(t, l, d, c);
        System.out.println("Your latest trip: ");
        System.out.println(b2.toString());

        beachList.add(b2);
    }
}


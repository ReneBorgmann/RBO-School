package Aufgabenblatt2;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main (String[]args){
    
    Scanner Input = new Scanner(System.in);
    
    System.out.print("Gefahrene Kilometer eingeben: ");
        double gefahreneKilometer = Input.nextDouble();

        if (gefahreneKilometer != 0) {
            System.out.print("Menge des verbrauchten Kraftstoffes (in Litern) eingeben: ");
            double verbrauchterKraftstoff = Input.nextDouble();

            double verbrauchPro100Km = (verbrauchterKraftstoff / gefahreneKilometer) * 100;

            System.out.println("Der Durchschnittsverbrauch auf 100 km beträgt: " + verbrauchPro100Km + " Liter");

        } else {
            System.out.println("Fehler: Die gefahrenen Kilometer dürfen nicht null sein.");
        }

        Input.close();
    
    }
}

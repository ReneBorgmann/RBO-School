package Aufgabenblatt2;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Möchten Sie den Gesamtwiderstand in Parallel- (P) oder Reihenschaltung (R) berechnen? ");
        char schaltungstyp = scanner.next().charAt(0);

        if (schaltungstyp == 'P' || schaltungstyp == 'p') {
            System.out.print("Bitte geben Sie den Wert des ersten Widerstands (R1) in Ohm ein: ");
            double r1 = scanner.nextDouble();

            System.out.print("Bitte geben Sie den Wert des zweiten Widerstands (R2) in Ohm ein: ");
            double r2 = scanner.nextDouble();

            double rg_parallel = 1 / ((1 / r1) + (1 / r2));
            System.out.println("Der Gesamtwiderstand in Parallelschaltung beträgt " + rg_parallel + " Ohm");
        } else if (schaltungstyp == 'R' || schaltungstyp == 'r') {
            System.out.print("Bitte geben Sie den Wert des ersten Widerstands (R1) in Ohm ein: ");
            double r1 = scanner.nextDouble();

            System.out.print("Bitte geben Sie den Wert des zweiten Widerstands (R2) in Ohm ein: ");
            double r2 = scanner.nextDouble();

            double rg_reihe = r1 + r2;
            System.out.println("Der Gesamtwiderstand in Reihenschaltung beträgt " + rg_reihe + " Ohm");
        } else {
            System.out.println("Ungültige Auswahl. Bitte geben Sie 'P' für Parallel- oder 'R' für Reihenschaltung ein.");
        }

        scanner.close();
    }
}

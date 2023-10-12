package Aufgabenblatt2;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den Bestellwert in Euro ein: ");
        double bestellwert = scanner.nextDouble();

        double rechnungsbetrag = 0.0;

        if (bestellwert < 100) {
            rechnungsbetrag = bestellwert + 5.50;
        } else if (bestellwert >= 100 && bestellwert <= 200) {
            rechnungsbetrag = bestellwert + 3.0;
        } else {
            rechnungsbetrag = bestellwert;
        }

        System.out.println("Der Rechnungsbetrag beträgt: " + rechnungsbetrag + " Euro");

        scanner.close();
    }
}

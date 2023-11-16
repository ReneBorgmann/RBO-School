import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        // Ein Scanner-Objekt erstellen, um den Bestellwert einzulesen
        Scanner scanner = new Scanner(System.in);

        // Benutzer auffordern, den Bestellwert einzugeben
        System.out.print("Bitte geben Sie den Bestellwert in Euro ein: ");
        
        // Den Bestellwert in Euro einlesen
        double bestellwert = scanner.nextDouble();

        // Überprüfen, ob der Bestellwert größer oder gleich 200 Euro ist
        if (bestellwert >= 200) {
            System.out.println("Rechnungsbetrag: " + bestellwert + " Euro (Versandkostenfrei)");
        } else {
            // Wenn der Bestellwert unter 200 Euro liegt, fügen wir die Versandkosten hinzu
            double versandkosten = 5.50;
            double rechnungsbetrag = bestellwert + versandkosten;
            System.out.println("Rechnungsbetrag: " + rechnungsbetrag + " Euro (inklusive 5,50 Euro Versandkosten)");
        }

        // Den Scanner schließen
        scanner.close();
    }
}

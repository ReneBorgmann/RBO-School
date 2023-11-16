import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        // Ein Scanner-Objekt erstellen, um die Benutzereingabe zu lesen
        Scanner scanner = new Scanner(System.in);

        // Benutzer auffordern, eine Zahl einzugeben
        System.out.print("Bitte geben Sie eine Zahl zwischen 40 und 50 ein: ");

        // Die eingegebene Zahl lesen
        int eingabe = scanner.nextInt();

        // Überprüfen, ob die Zahl zwischen 40 und 50 liegt
        if (eingabe >= 40 && eingabe <= 50) {
            System.out.println("Die eingegebene Zahl liegt im Bereich zwischen 40 und 50.");
        } else {
            System.out.println("Warnung: Die eingegebene Zahl liegt nicht im Bereich zwischen 40 und 50.");
        }

        // Den Scanner schließen
        scanner.close();
    }
}

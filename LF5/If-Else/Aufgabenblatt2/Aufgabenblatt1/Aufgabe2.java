import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        // Ein Scanner-Objekt erstellen, um die Benutzereingabe zu lesen
        Scanner scanner = new Scanner(System.in);

        // Benutzer auffordern, eine Zahl einzugeben
        System.out.print("Bitte geben Sie eine Zahl ein: ");

        // Die eingegebene Zahl lesen
        int eingabe = scanner.nextInt();

        // Überprüfen, ob die Zahl größer als 50 oder kleiner als 40 ist
        if (eingabe > 50 || eingabe < 40) {
            System.out.println("Warnung: Die eingegebene Zahl ist größer als 50 oder kleiner als 40.");
        } else {
            System.out.println("Die eingegebene Zahl liegt im erlaubten Bereich.");
        }

        // Den Scanner schließen
        scanner.close();
    }
}

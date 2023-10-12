import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Seitenlängen a, b und c des Dreiecks ein:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (istDreieckKonstruierbar(a, b, c)) {
            System.out.println("Das Dreieck ist konstruierbar.");
        } else {
            System.out.println("Das Dreieck ist nicht konstruierbar.");
        }

        scanner.close();
    }

    // Methode zur Überprüfung der Dreiecksgleichungen
    public static boolean istDreieckKonstruierbar(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}

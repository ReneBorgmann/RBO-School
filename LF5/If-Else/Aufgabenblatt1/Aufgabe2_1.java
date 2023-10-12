import java.util.Scanner;

public class Aufgabe2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den unteren Grenzwert ein: ");
        int untererGrenzwert = scanner.nextInt();

        System.out.print("Bitte geben Sie den oberen Grenzwert ein: ");
        int obererGrenzwert = scanner.nextInt();


        System.out.print("Bitte geben Sie eine Zahl ein: ");


        int eingabe = scanner.nextInt();

     
        if (eingabe < untererGrenzwert || eingabe > obererGrenzwert) {
            System.out.println("Warnung: Die eingegebene Zahl liegt außerhalb der Grenzwerte.");
        } else {
            System.out.println("Die eingegebene Zahl liegt im erlaubten Bereich.");
        }

     
        scanner.close();
    }
}

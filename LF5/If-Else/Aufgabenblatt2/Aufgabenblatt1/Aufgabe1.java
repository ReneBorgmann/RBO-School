import java.util.Scanner;

public class Aufgabe1 {
    public static void main (String[]args){
        Scanner Input = new Scanner(System.in);

        System.out.println("Geben sie eine Zahl ein:");
        int Zahl = Input.nextInt();

        if(Zahl >=50)
        {
            System.out.println("Ihre Zahl ist größer als 50");
        }
        else
        {
            System.out.println("Ihre Zahl ist kleiner als 50!");
        }

        Input.close();

    }
}

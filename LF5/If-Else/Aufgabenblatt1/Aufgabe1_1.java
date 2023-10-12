import java.util.Scanner;

public class Aufgabe1_1 {
        public static void main (String[]args){
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Geben Sie ihre Grenze ein:");
        int Grenze = Input.nextInt(); 
        System.out.println("Geben sie eine Zahl ein:");
        int Zahl = Input.nextInt();

        if(Zahl >=Grenze)
        {
            System.out.println("Ihre Zahl ist größer als " + Grenze);
        }
        else
        {
            System.out.println("Ihre Zahl ist kleiner als " + Grenze);
        }

        Input.close();

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner mec = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        heat = mec.nextInt();

        if (heat < 5) {
            System.out.println("You can ski.");
        } else if (heat >= 5 && heat <= 10) {
            System.out.println("You can go to the movies.");
        } else if (heat > 10 && heat <= 15) {
            System.out.println("You can go to the movies or on a picnic.");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("You can go on a picnic.");
        } else {
            System.out.println("You can go to swim.");
        }

    }
}
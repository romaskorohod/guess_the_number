package gb.lesson3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Vasha zadacha ugadat chislo.");
        for(int i = 10; i<=30; i +=10) playLevel(i);
        System.out.println("Vy vyigrali.");
        scanner.close();
    }

    private static void playLevel(int range){
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Ugadajte chislo ot 0 do " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Vy ugadali.");
                break;
            } else if (input_number > number) {
                System.out.println("Zagadannoe chislo menshe");
            } else {
                System.out.println("Zagadannoe chislo bolshe");
            }
        }
    }
}

package lesson_2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson_2_1 {
    public static void main(String[] args) {
        System.out.println("Your number: " + inputFloatNumber());
    }

    public static float inputFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        float a = 0.0F;
        boolean isCorrect = false;
        do {
            try {
                System.out.println("Введите дробное число:  ");
                a = scanner.nextFloat();
                isCorrect = true;
            } catch (InputMismatchException ex) {
                System.err.println("Указано не число");
                isCorrect = false;
                String line = scanner.nextLine();
            }
        } while (!isCorrect);
        scanner.close();
        return a;
    }
}

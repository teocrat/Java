package lesson_2;

import java.util.Objects;
import java.util.Scanner;

public class lesson_2_4 {
    public static void main(String[] args) {
        try (Scanner line = new Scanner(System.in)) {
            while (true) {
                System.out.println("Input name");
                String name = line.nextLine();
                if (Objects.equals(name, "")) {
                    System.err.println("Name string can`t be empty");
                } else {
                    System.out.println("Yor name: " + name);
                    break;
                }
            }
        }
    }
}

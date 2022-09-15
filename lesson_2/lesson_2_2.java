package lesson_2;

public class lesson_2_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[]{2, 3, 4, 5, 6, 7, 2, 8, 9, 10};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("Catching exception: Division by zero");
        }
    }
}

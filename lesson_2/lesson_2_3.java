package lesson_2;


public class lesson_2_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.err.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
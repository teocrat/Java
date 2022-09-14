public class lesson_1_1 {
    public static void main(String[] args) {
        f1();
//        f2();
//        f3();
    }

    public static void f1() {
        int a = 2 / 0;
    }

    public static void f2() {
        String str = "2e34";
        Integer.parseInt(str);
    }

    public static void f3() {
        int[] arr = new int[30];
        arr[40] = 4;
    }
}

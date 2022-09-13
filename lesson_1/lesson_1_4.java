import java.util.ArrayList;

public class lesson_1_4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 6, 12, 9, 7};
        int[] arr2 = new int[]{2, 3, 6, 1, 7};
        divArrays(arr1, arr2);
    }
    public static void divArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Lengths of arrays are not equal");
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Division by zero");
            }
            int div = array1[i] / array2[i];
            res.add(div);
        }
        System.out.println(res);
    }
}

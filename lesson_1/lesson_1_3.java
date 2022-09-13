import java.util.ArrayList;
public class lesson_1_3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 7, 9, 7, 2};
        int[] arr2 = new int[]{2, 3, 6, 1, 7};
        diffArrays(arr1, arr2);
    }

    public static void diffArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Lengths of arrays are not equal");
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < array1.length; i++) {
            int div = array1[i] - array2[i];
            res.add(div);
        }
        System.out.println(res);
    }
}

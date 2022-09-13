public class lesson_1_2 {
    public static void main(String[] args) {
        String[][] str = new String[][]{
                {"1", "2", "e3", "4", "5"},
                {"4", "2", "5", "3", "5"}
    };

//    int sum = sum2d(null);
    int sum = sum2d(str);
        System.out.println(sum);
}

    public static int sum2d(String[][] arr) {
        int sum = 0;
        if (arr == null) {
            throw new RuntimeException("Array is null");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < 5) {
                throw new RuntimeException("Number of rows less than 5");
            }
            for (int j = 0; j < 5; j++) {
                try {
                    Integer.parseInt(arr[i][j]);

                } catch (NumberFormatException e) {
                    System.err.println("Not a number");
                    break;

                }
                int val = Integer.parseInt(arr[i][j]);
                sum += val;


            }
        }
        return sum;
    }
}

public class RotateLeftByOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int val = arr[0];

        int[] new_arr = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            new_arr[i] = arr[i + 1];
        }
        new_arr[new_arr.length - 1] = val;

        for (int num : new_arr) {
            System.out.println(num);
        }
    }
}

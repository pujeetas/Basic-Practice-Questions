public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4 };
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
        }
        for (int i = 0; i <= count; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class IsArraySorted {
    public static void main(String[] args) {

        int[] unsortedArray = { 2, 4, 6, 8, 10};

        for (int i = 0; i < unsortedArray.length - 1; i++) {
            if (unsortedArray[i] > unsortedArray[i + 1]) {
                System.out.println("The array is not sorted in ascending order");
                return;
            }
        }
        System.out.println("The array is sorted in ascending order");
    }
}

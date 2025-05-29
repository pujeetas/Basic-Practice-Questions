public class LargestElement {
    public static void main(String[] args) {

        int[] arr = { 23, 56, 75, 21, 11, 45, 32 };

        int max_val = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > max_val){
                max_val = arr[i];
            }
        }
        System.out.println("The largest element is: " +max_val);
    }
}

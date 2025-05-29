public class InsertAtIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int ele = 50;
        int pos = 3; // insert at 3rd index(fourth place)

        int[] new_arr = new int[arr.length + 1];

        // copy elements before pos
        for (int i = 0; i < pos; i++) {
            new_arr[i] = arr[i];
        }

        // add new element to pos
        new_arr[pos] = ele;

        // shift and add remaining element
        for (int i = pos + 1; i < new_arr.length; i++) {
            new_arr[i] = arr[i - 1];
        }
        for (int num : new_arr) {
            System.out.println(num);
        }
    }
}

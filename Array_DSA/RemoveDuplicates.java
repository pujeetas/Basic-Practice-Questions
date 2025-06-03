public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 4 };

        int P1 = 1;
        int P2 = 1;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[P2] != nums[P2 - 1]) {
                nums[P1] = nums[P2];
                P1++;
            }
            P2++;
        }
        System.out.println(P1);
    }
}

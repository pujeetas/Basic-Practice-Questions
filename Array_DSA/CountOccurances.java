public class CountOccurances {
    public static void main(String[] args){
        int[] arr = {3,6,4,5,3,3,3};
        int num = 3;
        int count =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        System.out.println(count);
    }
}

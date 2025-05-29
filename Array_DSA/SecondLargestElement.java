public class SecondLargestElement {
    public static void main(String[] args){

        int[] arr = {23,45,18,23,55,69,10};
        int F_val = arr[0];
        int S_val = F_val;

        for(int i=0; i< arr.length-1; i++){
            if(arr[i] > F_val){
                S_val = F_val;
                F_val = arr[i];
            }
        }
        System.out.println(S_val);
    }
}

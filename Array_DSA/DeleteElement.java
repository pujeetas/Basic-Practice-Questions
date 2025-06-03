public class DeleteElement {
    public static void main(String[] args){
        int[] arr = {2,9,5,3,2,7};
        int index = 4;

        int[] new_arr = new int[arr.length-1];

        //copy elements before index
        for(int i=0; i<index; i++){
            new_arr[i] = arr[i];
        }
        //copying element after index
        for(int i=index+1; i<arr.length;i++){
            new_arr[i-1] = arr[i];
        }
        for(int num :new_arr){
            System.out.println(num);
        }
    }
}

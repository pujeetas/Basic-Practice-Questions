public class SearchElement {
    public static void main(String[] args){
        int[] arr ={3,1,6,9,4,5};

        int ele = 8;
        boolean isFound = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == ele){
                isFound = true;
                System.out.println("The element you serached is at index:" +i);
                break;
            }
        }
        if(isFound == false){
            System.out.println("The element you serached does not exist");
        }
    }
}

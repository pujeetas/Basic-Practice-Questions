public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 3, 12 };

        int low = 0;
        int mid = 0;

        while (mid< a.length) {
            if(a[mid] != 0){
                a[low] = a[mid];
                low++;
            }
            mid++;
        }
        while(low < a.length){
            a[low] = 0;
            low++;
        }
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}


public class LargestOfThree {
    public static void main(String[] args) {
       int a =1320;
       int b =540;
       int c =34320;

        int largest = a;

        if(b > largest){
            largest = b;
        }
        if(c > largest){
            largest = c;
        }
        System.out.println(largest + " is largest of all");
    }
}

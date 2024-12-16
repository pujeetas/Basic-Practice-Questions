public class OddEven {
    public static void main(String[] args) {
        Check ch = new Check();
        ch.OddEven(3);

    }
    public static class Check{
        
        public void OddEven(int num){

            if(num % 2 == 0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
    }
}



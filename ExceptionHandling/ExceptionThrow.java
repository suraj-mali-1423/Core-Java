package ExceptionHandling;

public class ExceptionThrow {
    public static int getReady(int [] arr)throws ArithmeticException {
          return arr[8];
    }
    public static void main(String[] args) {
          int arr [] = new int[5];

          try {
              getReady(arr);
          }catch (Exception e){
              System.out.print("Exception Comming Man... "+e.getMessage());
          }
    }
}

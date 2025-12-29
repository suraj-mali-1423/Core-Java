package ExceptionHandling;

import java.util.Scanner;

class MyException extends  Exception{
         public MyException(String Msg){
                    super(Msg);
         }
}

public class CustomeException {
    public static void main(String[] args)throws MyException {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the age :");

        try {
            int Age = Sc.nextInt();
            if (Age > 100) {
                throw new MyException("My Error Is this");

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

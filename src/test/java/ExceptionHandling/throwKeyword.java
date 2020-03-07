package ExceptionHandling;

import java.io.FileNotFoundException;

public class throwKeyword {


    public static void main(String arg[])throws Exception{

        int age = 17;

        if(age>=18){
            System.out.println("You can vote");
            System.out.println("HI");
            throw new ArithmeticException("Get registered");
        }else if(age==10) {
            System.out.println("HI");
            throw new NullPointerException("Get registered");

        }else if(age==10){
            System.out.println("HI");
            throw new FileNotFoundException("Get registered");
        }

        System.out.println("THnaks for voting");
        System.out.println("HI");
        throw new NumberFormatException("Get registered");
    }

}

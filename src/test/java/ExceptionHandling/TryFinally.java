package ExceptionHandling;

public class TryFinally {

    public static void main(String arg[]){

        System.out.println("Starting.....");

        try{

           int i = 10/0;
             System.out.println(i);
        }finally {
            System.out.println("Closing connection");
        }



        System.out.println("Ending.....");
    }


}

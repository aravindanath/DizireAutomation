package ExceptionHandling;

public class DemoException {

    public static void main(String arg[]){

        System.out.println("Starting.....");

        try{

            int i[] = new int[3];
            i[0]=10;
            i[1]=30;
            i[2]=50;
            i[10]=2345;
            System.out.println(i[10]);
        }catch (Exception e){
           e.printStackTrace();
        }finally {
            System.out.println("Closing connection");
        }



        System.out.println("Ending.....");
    }


}

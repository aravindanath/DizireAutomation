package learningCollections;

public class ConvertingStringtoArray {


    public static void main(String arg[]){


        String securePin = "123456";
        /**
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         */



        for(int i =0; i<securePin.length();i++){
           char pin = securePin.charAt(i);
            System.out.println(pin);
        }

    }

}

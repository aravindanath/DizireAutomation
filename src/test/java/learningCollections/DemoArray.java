package learningCollections;

import java.util.Arrays;

public class DemoArray {


    public static void main(String arg[]){

        //           0,1,2,3,4,5,6,7,8
        int num[] = {12,122,43,64,36,79,90,99,101,333};
        int roll[] = new int[5];
        roll[0]=101;
        roll[3]=102;
        roll[1]=103;
        roll[2]=104;
        roll[4]=105;


        for(int i=0; i<num.length;i++){
            System.out.println("Before sort: "+ num[i]);
        }

        Arrays.sort(num);

        for(int i=0; i<num.length;i++){
            System.out.println("After sort: "+ num[i]);
        }


        for(int i : num){
            System.out.println(i);
        }


    }

}

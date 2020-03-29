package learningCollections;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet1 {



    public static void main(String arg[]){


        HashSet<String> std = new HashSet<String>();


        std.add("Arvind");
        std.add("Kripa");
        std.add("Arvind");

        System.out.println(std
        );


        HashSet<Integer> val = new HashSet<Integer>();
        val.add(33);
        val.add(44);
        val.add(22);
        val.add(33);


        System.out.println(val
        );





    }



}

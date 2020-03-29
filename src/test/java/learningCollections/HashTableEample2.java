package learningCollections;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class HashTableEample2 {

    /**
     * a = "Apple","Amereica","Africa"
     * b = "Bluetooth","Bombay","bagalore"
     * b ="Brown"
     * @param arg
     */

    public static void main(String arg[]){
        //KEy, Value



        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Apple");
        l1.add("America");
        l1.add("Africa");
        l1.add("Ankapalli");

        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("Bluetooth");
        l2.add("Bloomburg");
        l2.add("Bloom");
        l2.add("Bluff");


        HashMap<Character,List<String>> mp = new HashMap<Character, List<String>>();


        mp.put('A',l1);

        mp.put('B',l2);


        System.out.println(l1.get(3));

        System.out.println(mp.get('A').toString().substring(0,3));



    }
}

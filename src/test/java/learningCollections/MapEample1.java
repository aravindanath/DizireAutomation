package learningCollections;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.HashMap;
import java.util.Map;

public class MapEample1 {



    public static void main(String arg[]){
        //KEy, Value
        HashMap<Integer,String> mp = new HashMap<Integer, String>();

        mp.put(101,"Arvind");
        mp.put(102,"Shilpi");
        mp.put(103,"Kumar");
        mp.put(104,"Kripa");


        HashMap<Integer,String> mp1 = new HashMap<Integer, String>();

        mp1.putAll(mp);
        mp1.put(201,"Swagath");
        System.out.println(mp1);


        for(HashMap.Entry m : mp1.entrySet()){

//            System.out.println(m);
            System.out.println(m.getKey());
        }




    }
}

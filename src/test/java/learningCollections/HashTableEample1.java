package learningCollections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableEample1 {



    public static void main(String arg[]){
        //KEy, Value
        HashMap<Integer,String> mp = new HashMap<Integer, String>();

        mp.put(101,"Arvind");
        mp.put(102,"Shilpi");
        mp.put(103,"Kumar");
        mp.put(104,"Kripa");
        mp.put(null,null);
        mp.put(null,"polo");
        mp.put(null,"LP");

        System.out.println(mp);
        Hashtable<Integer,String> m = new Hashtable<Integer, String>();
        m.put(201,"Kishore");
        m.put(202,"Deeopal");
       // m.put(null,null);


        System.out.println(mp.get(null));





    }
}

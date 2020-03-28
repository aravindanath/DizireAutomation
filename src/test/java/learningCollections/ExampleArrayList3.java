package learningCollections;


import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;


public class ExampleArrayList3 {

//https://www.w3resource.com/java-exercises/collection/index.php#arraylist

    public static void main(String arg[]){


        ArrayList<String>  list = new ArrayList<String> ();
        list.add("Ganesh"); //0
        list.add("Shilpi"); //1
        list.add("Arun");//2
        list.add("Md");//3
        list.add("Ganesh");//4

        list.add(0,"Arvind");


        ArrayList<Object> list1 = new ArrayList<Object>();

        list1.addAll(list);
        list1.add(0,"BMW");
        list1.add(6,"Audi");


        Iterator it = list1.iterator();
//        System.out.println(it.hasNext());



        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}

package learningCollections;


import java.util.ArrayList;


public class ExampleArrayList1 {



    public static void main(String arg[]){


        ArrayList<String>  list = new ArrayList<String> ();
        list.add("Ganesh"); //0
        list.add("Shilpi"); //1
        list.add("Arun");//2
        list.add("Md");//3
        list.add("Ganesh");//4
//       list.add(23453);
//        list.add('s');
        list.add(0,"Arvind");


        ArrayList<Object> list1 = new ArrayList<Object>();

        list1.addAll(list);
        list1.add(0,"BMW");
        list1.add(6,"Audi");


        System.out.println(list1);


    }
}

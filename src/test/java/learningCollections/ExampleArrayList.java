package learningCollections;



import java.util.*;


public class ExampleArrayList {



    public static void main(String arg[]){


        ArrayList<Object>  list = new ArrayList<Object> ();
        list.add("Ganesh"); //0
        list.add("Shilpi"); //1
        list.add("Arun");//2
        list.add("Md");//3
        list.add("Ganesh");//4
        list.add(23453);
        list.add('s');


        System.out.println(list.size());
        System.out.println(list.get(1));


//
////
//        for(Object str : list){
//            System.out.println(str);
//        }
//
////
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }


        // Reverse
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

    }
}

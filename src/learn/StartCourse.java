package learn;

import java.util.*;

public class StartCourse {

    public static void main(String[] args) {
        System.out.println("Welcome to code java Collection Framework");
//---------------------Type Safe ----------------------------


         ArrayList<String> names = new ArrayList<String>();
         names.add("jayna");
         names.add("Vyom");
        names.add("Geeta");
        names.add("Sita");
        names.add("Sita");
        System.out.println(names);
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
        //------------------------------------- Un Type Safe-----------

//
//        LinkedList list = new LinkedList();
//        list.add("Sachin");
//        list.add(101);
//        list.add(123.4);
//        list.add(true);
//        System.out.println(list);
names.remove("Sita");
        System.out.println(names);

        // Size
        System.out.println("Size = " +names.size() );

        // contains check

        System.out.println(names.contains("jayna"));

        //Check for empty

       // System.out.println(names.isEmpty());

        //setting value

        //names.set(2,"Ram");
        names.add(1,"Vyom");
        System.out.println(names);

       // names.clear();
        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println("Vector" +vector);

        System.out.println("----------------------------------------------------------------------");


        HashSet<Double> nms = new HashSet<>();
        nms.add(14.1);
        nms.add(36.2);
        nms.add(2345.44);
        nms.add(99.3);
        nms.add(99.3);
        nms.add(5.3);
        System.out.println(nms);

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(nms);

    }
}

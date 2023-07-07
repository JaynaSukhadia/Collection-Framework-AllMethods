package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jayna");
        names.add("Vyom");
        names.add("Geeta");
        names.add("Sita");
        names.add("Sita");
for(String str:names)
{
    System.out.print(str + "\t"+str.length() + "\t");
    StringBuffer br = new StringBuffer(str);
    System.out.println(br.reverse());
}

        System.out.println("===================================================");

//traverse using Iterator for forward
        Iterator<String> itr = names.iterator();

        while (itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");


//Backwardtraverse using Iterator


        ListIterator<String> litr =names.listIterator(names.size());
        while (litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }


        System.out.println("______________________________________________________");

        //For Each

        names.forEach(str ->{
            System.out.println(str);
        });

        System.out.println("Sorting Of Elements");
        TreeSet<String> set = new  TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });
    }

}

package array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {


        List<Integer> alist1 = new ArrayList<>();
        alist1.add(10);
        alist1.add(30);
        alist1.add(13);
        alist1.add(30);
        //Using for loop
        System.out.println("Using for loop======");
        for (int i = 0; i < alist1.size(); i++) {
            System.out.println(alist1.get(i));
        }
        //  for-each loop
        System.out.println("Using for-each loop====");
        for (Integer i:alist1) {
            System.out.println(i);
        }
        // Using Iterator
        System.out.println("Using Iterator=======");
        Iterator<Integer> itr = alist1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(alist1);
        System.out.println(alist1);

    }
}




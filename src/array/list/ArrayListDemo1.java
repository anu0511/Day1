package array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Anu");
        names.add("Ram");
        names.add("Shyam");
        names.add("Manu");
        //Using for loop
        System.out.println("Using for loop======");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //  for-each loop
        System.out.println("Using for-each loop====");
        for (String name : names) {
            System.out.println(name);
            System.out.println(name.length());
        }
        // Using Iterator
        System.out.println("Using Iterator=======");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(names);
        System.out.println(names);

    }
}

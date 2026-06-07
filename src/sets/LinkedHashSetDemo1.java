package sets;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(); //<> is generics(fot type safety)
        set1.add(1000);
        set1.add(30);
        set1.add(13);
        set1.add(30);
        set1.add(2);
        set1.add(13);
        set1.add(8);
        System.out.println(set1);//[1000, 30, 13, 2, 8]
    }
}

package sets;

import java.util.TreeSet;

//TreeSet is a special kind of set used for testing
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>();
        tset.add("anu");
        tset.add("prakash");
        tset.add("sumit");
        tset.add("pravin");
        System.out.println(tset); //[anu,prakash,sumit,pravin]

        TreeSet<String> tset2=new TreeSet<>(new SortDescendingComparator());
        tset2.add("anu");
        tset2.add("prakash");
        tset2.add("sumit");

        tset2.add("pravin");

        System.out.println(tset2);






    }
}

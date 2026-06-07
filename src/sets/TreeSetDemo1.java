package sets;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<String> tset = new TreeSet<>();
        tset.add("anu");
        tset.add("praksah");
        tset.add("sumit");
        tset.add("praveen");
        System.out.println(tset);//[anu, praksah, praveen, sumit]
        //descending using inbulit method
        System.out.println(tset.descendingSet());//[sumit, praveen, praksah, anu]
    }
}

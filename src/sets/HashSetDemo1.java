package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {


    Set<Integer> hset1 = new HashSet<>(); //<> is generics(fot type safety)
        hset1.add(10);
        hset1.add(30);
        hset1.add(13);
        hset1.add(30);
        hset1.add(2);
        System.out.println(hset1);

    Set<String> hset2 = new HashSet<>();
        hset2.add("anu");
        hset2.add("praksah");
        hset2.add("sumit");
        hset2.add("praveen");

        System.out.println(hset2);

        System.out.println("iteration using classical for loop can not be done because set is not indexed based");
        System.out.println("iteration using for each loop===");
        for(  String s:hset2 ){
        System.out.println(s);
    }
        System.out.println("iteration using iteration===");

}
}

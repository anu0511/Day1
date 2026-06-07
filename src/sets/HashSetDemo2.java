package sets;

import java.util.*;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Integer> hset1=new HashSet<>();
        hset1.add(1000);
        hset1.add(30);
        hset1.add(13);
        hset1.add(30);
        hset1.add(2);
        hset1.add(13);
        hset1.add(8);
        System.out.println(hset1);
        System.out.println(hset1.contains(30));
        System.out.println(hset1.contains(130));
        System.out.println(hset1.size());
        //sort way1
        List<Integer> list=new ArrayList<>(hset1);
        Collections.sort(list);

        //way2
        Set<Integer> tset=new TreeSet<>(hset1);
        System.out.println(tset);






    }
}

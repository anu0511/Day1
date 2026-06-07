package array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        List<Integer> alist1=new ArrayList<>();
        alist1.add(10);
        alist1.add(30);
        alist1.add(13);
        alist1.add(30);
        System.out.println(alist1);
        System.out.println(alist1.contains(30));
        System.out.println(alist1.contains(80));
        System.out.println(alist1.indexOf(13));
        alist1.remove(new Integer(30));
        System.out.println(alist1);
        alist1.add(5);
        System.out.println(alist1);
        Collections.sort(alist1);
        System.out.println(alist1);





    }
}

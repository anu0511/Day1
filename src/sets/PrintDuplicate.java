package sets;

import java.util.HashSet;

public class PrintDuplicate {
    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 2, 5, 4};

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Duplicates:");

        for (int num : arr) {

            // add() returns false if duplicate exists
            if (!set.add(num)) {
                System.out.println(num);
            }
        }
    }

}

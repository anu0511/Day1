package sets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40, 20, 300, 40, 700};

        Map<Integer, Integer> map = new HashMap<>();

       // for (int num : numbers) {
           // map.put(num, map.getOrDefault(num, 0) + 1);


        //}

        for (int num : numbers) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> setOfKeys = map.keySet();
        for (int number : setOfKeys) {
            int value = map.get(number);
           // if (value > 1) System.out.println(number);
            System.out.println(number+ "--->"+ value);


        }

    }

    }




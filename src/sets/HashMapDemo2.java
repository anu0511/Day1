package sets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap1=new HashMap<>();
        Map<String,Integer> hmap2=new HashMap<>();


        hmap1.put(101,"anu");
        hmap1.put(110,"Salim");
        hmap1.put(105,"pragati");
        hmap1.put(120,"anu");
        hmap1.put(105,"robert");




        hmap2.put("110",20);
        hmap2.put("120",30);
        hmap2.put("110",70);

        hmap2.put("120",10);

        hmap2.put("180",20);

        Set<Map.Entry<String,Integer>> setOfEntry1=hmap2.entrySet();
        for(Map.Entry<String,Integer> entry: setOfEntry1){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        //way2


        Set<String> setOfKeys1=hmap2.keySet();
        for(String key : setOfKeys1){
            System.out.println(key +" "+hmap2.get(key));
        }



        //fastest way of iterating a map
        Set<Map.Entry<Integer,String>> setOfEntry=hmap1.entrySet();
        for(Map.Entry<Integer,String> entry: setOfEntry){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        //way2
        Set<Integer> setOfKeys=hmap1.keySet();
        for(Integer key : setOfKeys){
            System.out.println(key +" "+hmap1.get(key));
        }


    }
}

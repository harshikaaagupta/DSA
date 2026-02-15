import java.util.*;

public class hashmapOperations {
    public static void main(String args[]){
        //create
        HashMap <String , Integer> hm = new HashMap<>();

        //insert
        hm.put("India", 150);
        hm.put("Bhutan" , 100);
        hm.put("US",120);
        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));

        //remove - O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}

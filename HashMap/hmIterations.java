
import java.util.*;

public class hmIterations {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India",200);
        hm.put("China",100);
        hm.put("US",150);
        hm.put("Dubai",170);
        hm.put("Indonesia",75);
        hm.put("Europe",140);

        //set
        Set <String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys "+k+" , values = "+hm.get(k));
            
        }


    }
}

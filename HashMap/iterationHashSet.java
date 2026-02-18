
import java.util.HashSet;

public class iterationHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //Using advanced for loop

        for(String city : cities){
            System.out.println(city);
        }



    }
}

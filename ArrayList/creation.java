import java.util.*;
public class creation {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();

        //Add operation

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,7);
        System.out.println(list);

        //get operation
        int ele = list.get(2);
        System.out.println(ele);

        //Remove
        list.remove(2);
        System.out.println(list);

        //Set element at index
        list.set(2,19);
        System.out.println(list);

        //Contains element
        System.out.println(list.contains(2));
    }
    
}

import java.util.*;
public class unionIntersection {
    public static void main(String[] args) {
        int arr1[] = {3,2,9};
        int arr2[] = {1,2,3,4,9,7,6};

        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union size : "+set.size());

        //intersection
        set.clear();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i = 0 ;i <arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection size : "+count);
        
    }
}

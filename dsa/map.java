import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {10,10,29,24,43,53};
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        

        for(int key: map.keySet()){
            System.out.println(key+"  "+map.get(key));
        }
    }
}

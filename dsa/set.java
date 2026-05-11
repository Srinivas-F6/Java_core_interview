import java.util.*;
public class set {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();

        set.add(19);
        set.add(20);

        for(int ele: set){
           System.out.println(ele);
        }
    }
}

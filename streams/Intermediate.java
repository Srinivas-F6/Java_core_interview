import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.*;

public class Intermediate {
    public static void main(String[] args) {

        String[] names = {"Ashiq","vijay","rahul","ravana","Iyer","singh"};
        Stream<String> namesStream = Stream.of(names);
        
        // filter -- It acts as a gate
        namesStream
          .filter(val -> val.length()%2==0)
          .forEach(ans -> System.out.print(ans+" "));

        
        // map -- It acts as a transformer
        int[] data = {19,2,3,57,78,87,9};
        IntStream dataStream = Arrays.stream(data);
        dataStream
          .map(val -> val*2)
          .forEach(ans -> System.out.print(ans+" "));

        // reduce -- it is a terminal operation

        Set<String> hs = new HashSet<>(Arrays.asList("a","b","c","d","e"));
        String res = hs.stream()
                       .reduce("", (val,ans)->val+ans);
        System.out.println(res);
        

        
    }
}

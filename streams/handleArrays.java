import java.util.*;
import java.util.stream.*;
public class handleArrays{
    public static void main(String[] args) {

        
        int[] primitiveArray = {19,23,45,32,55,323,23,232,32576,424};
        IntStream s = Arrays.stream(primitiveArray);                //LongStream  DoubleStream
        s.forEach(System.out::println);


        String[] fruits = {"apple","mango","pineApple","custardApple"};
        Stream<String> fruitsStream = Stream.of(fruits);                 //Stream<T> 
        fruitsStream.forEach(System.out::println);


        Integer[] wrapper = {29,323,424,34};
        Stream<Integer> wrapperInteger = Stream.of(wrapper);         //Stream<T>
        wrapperInteger.forEach(System.out::print);


        // for collections     (name.stream())

        List<String> guns = Arrays.asList("AWM","M416","kar98K","DP28");
        Stream<String> gunsStream = guns.stream();
        gunsStream.forEach(val -> System.out.print(val+" "));


        // for maps  (name.entrySet())  --> for keys (name.keySet())   --> for values (name.values())

        Map<String, Integer> map = new HashMap<>();
        map.put("Bahubali",1810);
        map.put("pushpa",1710);
        map.put("Kalki-289D",1200);

        Stream<Map.Entry<String,Integer>> mapStreams = map.entrySet().stream();
        Stream<String> movieNames = map.keySet().stream();
        Stream<Integer> collections = map.values().stream();

        mapStreams
           .forEach(entry -> System.out.println(entry.getKey()+"   "+entry.getValue()));

        movieNames
           .forEach(key -> System.out.println(key));

    }
}

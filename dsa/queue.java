
import java.util.PriorityQueue;
import java.util.Queue;



public class queue {
    public static void main(String[] args){

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(40);
        queue.add(84);
        while(!queue.isEmpty()){
           System.out.println(queue.poll());
        }
    }
}

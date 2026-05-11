
import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addFirst(30);
        deque.add(44);
        
        // while(!deque.isEmpty()){
        //    System.out.print(deque.poll());
        // }

        deque.addLast(38);
        deque.removeFirst();

        System.out.println(deque.getFirst());
        System.out.println(deque.peekFirst());

        for(int i=0; i<=deque.size(); i++){
            System.out.println(deque.poll());
        }
    }
}

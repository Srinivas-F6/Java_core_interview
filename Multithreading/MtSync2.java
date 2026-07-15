class Displays{
   public  synchronized void display(int n){
        for(int i=0; i<n; i++){
            System.out.print(i+" ");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

class Mythread extends Thread{

    Displays d;
    int n;

    public Mythread(Displays d, int n) {
        this.d = d;
        this.n = n;
    } 

    @Override
    public void run(){
        d.display(n);
    }
}
public class MtSync2 {
    public static void main(String[] args) {
        Displays d1 = new Displays();
        Displays d2 = new Displays();

        Mythread t = new Mythread(d1,5);
        Mythread s = new Mythread(d2, 8);
         t.start();
         s.start();

        
    }
}

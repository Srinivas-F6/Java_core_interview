class MyThread implements Runnable{

    @Override
    public void run(){
        display(5);
        System.out.println("                     ");
        display(3);
    }
    public synchronized  void display(int n){
        for(int i=0; i<n; i++){
            System.out.println("Hiiiiiiiiiiiiii ");
        }
    }

}

public class MtSync1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start();
    }
}

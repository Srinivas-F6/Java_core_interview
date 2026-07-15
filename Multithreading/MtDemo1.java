class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("child running");
    }
}

class Thread2 implements Runnable{

    @Override
    public void run(){
        System.out.println("Faah");
    }
}

public class MtDemo1{
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        System.out.println("hiii");

        Runnable s = new Thread2();
        Thread th = new Thread(s);
        th.start();
    }
}
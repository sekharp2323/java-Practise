public class T1 extends Thread implements Runnable {
    public void run(){
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        T1 t=new T1();
        T1 t1=new T1();
        t.start();
        t1.start();
        Thread t2=new Thread(()->System.out.println("Runnable thread is Running!!!"));
        t2.start();
    }
}

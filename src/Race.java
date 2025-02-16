class Counter{
    private int count=0;
    synchronized void increment(){
        count++;
    }
    int getCount(){
        return count;
    }
}
public class Race {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++){
                c.increment();
            }
        });
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println("Final count: "+c.getCount());
    }
}

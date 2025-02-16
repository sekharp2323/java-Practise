class Sharedresource {
    synchronized void sharedmethod(String threadName) {
        System.out.println(threadName + " acquired the lock and is executing");
        try {
            Thread.sleep(2000); // Only InterruptedException is possible
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " released lock");
    }
}

public class Sync {
    public static void main(String[] args) {
        Sharedresource obj = new Sharedresource();
        Thread t1 = new Thread(() -> obj.sharedmethod("Thread 1"));
        Thread t2 = new Thread(() -> obj.sharedmethod("Thread 2"));

        t1.start();
        t2.start();
    }
}

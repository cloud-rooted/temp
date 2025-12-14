class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running, count: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r);
        t1.setName("Thread-1");
        t1.start();

        Thread t2 = new Thread(r);
        t2.setName("Thread-2");
        t2.start();
    }
}

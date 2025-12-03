class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();   // starts a new thread, calls run()

        System.out.println("Main thread finished");
    }
}

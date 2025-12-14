class MyThread extends Thread {
    public void run() {  // Overriding run() method
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();  // Starts a new thread
        t2.start();
    }
}

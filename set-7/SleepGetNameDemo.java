class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running, count: " + i);
            try {
                Thread.sleep(1000);  // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

public class SleepGetNameDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Thread-A");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("Thread-B");
        t2.start();
    }
}

package com.nayakam.practice.thread;

/**
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Thread.html
 * http://stackoverflow.com/questions/2213340/what-is-daemon-thread-in-java
 * http://stackoverflow.com/questions/7067578/when-are-daemon-threads-useful
 */
public class DaemonTest {

    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();
        workerThread.start();

        try {
            Thread.sleep(7500);
        } catch (InterruptedException e) {
            // handle here exception
        }

        System.out.println("Main Thread ending : workerThread.isDaemon: " + workerThread.isDaemon() +
                ",WorkerThreadName: " + workerThread.getName());
    }

}

class WorkerThread extends Thread {

    public WorkerThread() {
        // When false, (i.e. when it's a user thread),
        // the Worker thread continues to run.
        // When true, (i.e. when it's a daemon thread),
        // the Worker thread terminates when the main 
        // thread terminates.
        // Must be called before start()
        setDaemon(false);
    }

    public void run() {
        int count = 0;

        while (true) {
            System.out.println("Worker Thread run count : " + count + ", isDaemon :" + this.isDaemon() + ",this.getName(): " + this.getName());

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Worker Thread Finally run count : " + count++ + ",this.getName(): " + this.getName());
            }
        }
    }
}
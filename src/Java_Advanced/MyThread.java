package Java_Advanced;

/**
 * Thread Klasse mit extends Thread
 */
public class MyThread extends Thread {

    Integer count;

    public MyThread() {
        this.count = 0;
    }

    @Override
    public void run() {

        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ++count;
            System.out.println(count);

        } while (count != 60);

    }



}

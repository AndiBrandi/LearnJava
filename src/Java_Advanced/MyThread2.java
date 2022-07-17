package Java_Advanced;


/**
 * Thread Klasse mit implements Runnable Interface
 */
public class MyThread2 implements Runnable {

    Integer count;

    public MyThread2() {
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

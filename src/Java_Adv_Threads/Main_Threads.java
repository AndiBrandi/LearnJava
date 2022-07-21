package Java_Adv_Threads;

public class Main_Threads {

    static Integer count = 0;
//    static Thread t3;


    public static void main(String[] args) {




        //Starten von MyThread
        MyThread mt = new MyThread();
        mt.start();


        //Starten von MyThread2
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(mt2);
        t.start();


        //Starten eines anonymen Java_Adv_Threads
        Thread t3 = new Thread() {
            @Override
            public void run() {
                do {
                    ++count;
                    System.out.println(count);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } while (count != 60);
            }
        };
        t3.start();


    }

}

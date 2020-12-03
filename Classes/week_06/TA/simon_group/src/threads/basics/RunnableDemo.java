package threads.basics;


public class RunnableDemo implements Runnable {
//ThreadExtends
    @Override
    public void run() {
        while (true){
            System.out.println("Hello from "+Thread.currentThread().getName());
            try {
                Thread.sleep(189);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]) {
        RunnableDemo r1 = new RunnableDemo();
        Thread t1 = new Thread(r1);
        t1.setName("t1");
        t1.start();


        RunnableDemo r2 = new RunnableDemo();
        Thread t2 = new Thread(r2);
        t2.setName("t2");
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true){ // main Thread
            System.out.println("Hello from "+Thread.currentThread().getName());
            try {
                Thread.sleep(189);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



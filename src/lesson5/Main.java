package lesson5;

public class Main {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("t1");
//        MyThread t2 = new MyThread("t2");
//
//        t1.start();
//        t2.start();

//        t1.run();
//        t2.run();


//        Thread t1 = new Thread(new MyRunnable("t1"));
//        Thread t2 = new Thread(new MyRunnable("t2"));
//
//        t1.start();
//        t2.start();


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("t1 " + i);
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("t2 " + i);
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();


//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("t1 " + i);
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("t2 " + i);
//            }
//        });
//
//        t1.start();
//        t2.start();


//        Thread t1 = new Thread(() -> {
////            System.out.println(1);
////        });
////
////        Thread t2 = new Thread(() -> {
////            System.out.println(2);
////        });
////
////        t1.start();
////        t2.start();
////
////        System.out.println(3);


//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("t1 " + i);
//            }
//        });
//
//        t1.start();
//
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("end");


//        Counter counter = new Counter();
//        Object mon = new Object();
//
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (mon){
//                    counter.inc();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (mon){
//                    counter.dec();
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter.getC());


//        ATM atm = new ATM(100);
//        Thread t1 = new Thread(()->{
//            atm.take(50,"user1");
//        });
//        Thread t2 = new Thread(()->{
//            atm.take(50,"user2");
//        });
//        Thread t3 = new Thread(()->{
//            atm.take(50,"user3");
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        atm.info();

        Thread t1 = new Thread(new Runnable() {
            int seconds = 0;
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                    if(Thread.currentThread().isInterrupted()){
                        return;
                    };
                    seconds++;
                    System.out.println("time: "+ seconds);
                }
            }
        });

//        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();
        System.out.println("END");

    }
}

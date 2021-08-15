package FunctionalInterface.parameter;

public class RunnableDemo {
    public static void main(String[] args) {
        // anonymous inner class
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ", " + "Thread started");
            }
        });

        startThread(() -> System.out.println(Thread.currentThread().getName() + ", " + "Thread started"));
    }

    private static void startThread(Runnable runnable) {
//        Thread t = new Thread(runnable);
//        t.start();
        new Thread(runnable).start();

    }
}

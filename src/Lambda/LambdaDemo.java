package Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
//        // Implement class
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
//
//        // anonymous inner class
//         new Thread(new MyRunnable(){
//             @Override
//             public void run() {
//                 System.out.println("Start");
//             }
//         }).start();

         // lambada function
        new Thread( () -> System.out.println("Start") ).start();

    }
}

package MultiThreading;

public class MyThread extends  Thread {
    @Override
    public void run() {
        System.out.println("Running...");
         try{
              Thread.sleep(200);
             System.out.println("Aaloooo");
         }
         catch (InterruptedException e){
             System.out.println(e);
         }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        System.out.println(t.getState()); // Return the NEW State
        t.start();
        System.out.println(t.getState()); // Return the RUNNABLE State
         Thread.sleep(100);
        System.out.println(t.getState()); // Return the TIMED_WAITING State
        t.join();
        System.out.println(t.getState()); // Return the TERMINATED State
    }
}

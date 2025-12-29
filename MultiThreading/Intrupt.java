package MultiThreading;

public class Intrupt  extends Thread{

    public  Intrupt (String Str) {
            super(Str);
    }
    @Override
    public void run() {
         try{
             while(true){
                 System.out.println("Hello World!");
             }
         }catch (Exception e){
             System.out.println("Thread Intruptted : " +e);
         }
    }

    public static void main(String[] args) {
        Intrupt t1 = new Intrupt("T1");

        Intrupt t2 = new Intrupt("T2");
        t1.start();
        t2.start();
        t2.isDaemon();
        t1.isDaemon();
        System.out.println("Main is Done");
    }
}

package MultiThreading;

public class Test {
    public static void main(String[] args) {
        World w = new World();
        Thread T1 = new Thread(w);
        T1.start();
         for ( ; ; ){
             System.out.println(Thread.currentThread().getName());
         }
    }
}

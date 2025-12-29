package Synchronyzation;

public class MyThread extends Thread {
        private Counter cnt;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
              cnt.Incre();
        }
    }

    public MyThread(Counter cnt){
               this.cnt = cnt;
        }
}

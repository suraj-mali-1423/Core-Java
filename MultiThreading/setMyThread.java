package MultiThreading;

public class setMyThread extends  Thread {

    setMyThread ( String name){
          super(name);
    }

    @Override
    public void run() {
        String a = "";
        for (int i = 0; i < 10000000; i++) {
            a += "a";
        }


        System.out.println(Thread.currentThread().getName() + " - Priority : " + Thread.currentThread().getPriority() + " Name Of the thread : " + Thread.currentThread().getName());

        try {
             Thread.sleep(10);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
            setMyThread l = new setMyThread("Low");
            setMyThread m = new setMyThread("Medium");
            setMyThread n = new setMyThread("High");

            l.setPriority(Thread.MIN_PRIORITY);
            m.setPriority(Thread.NORM_PRIORITY);
            n.setPriority(Thread.MAX_PRIORITY);

            l.start();
            m.start();
            n.start();
    }
}

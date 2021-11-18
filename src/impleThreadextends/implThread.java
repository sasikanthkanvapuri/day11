package impleThreadextends;
public class implThread extends Thread {

    public void run() {
        for(int i=0;i<10;i++) {

            System.out.println("thread is running...");
        }
    }

    public static void main(String args[]) {
        implThread obj = new implThread();
        obj.start();
        for(int i=0;i<10;i++) {

            System.out.println("thread is running... in main method");
        }
    }
}


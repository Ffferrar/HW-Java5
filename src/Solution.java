import java.util.Timer;
import java.util.TimerTask;

public class Solution{

    public static void main (String[] args) throws InterruptedException {
        // Задание №1
        new Runner().run();
        new MyThread().run();

        // Задание №2
        MyCLock clocks = new MyCLock();
        clocks.run();
        //clocks.disable(); //метод останавливает clocks.run()
        Thread.interrupted();
    }
}


class Runner implements Runnable{
    public void run(){
        System.out.println("This is runnable thread");
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("This is extended thread");
    }
}
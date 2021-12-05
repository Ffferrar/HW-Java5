import java.util.Timer;
import java.util.TimerTask;
//Задание №1
public class MyCLock extends Thread {
    private boolean isActive = true;

    void disable() {
        isActive = false;
    }

    public void run() {
            try {
                if (!isInterrupted()) {
                    if (isActive) {
                        System.out.println("Tik");
                        Thread.sleep(500);
                        System.out.println("Tak");
                        Thread.sleep(500);

                    }
                }
                else{
                    throw new InterruptedException(); //бросаем исключение в таких случаях как этот (циклы)
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
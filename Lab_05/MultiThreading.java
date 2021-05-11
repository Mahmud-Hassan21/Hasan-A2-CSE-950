
import java.util.Random;
import java.util.concurrent.TimeUnit;

class RandomNumberThread extends Thread {

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomInteger = random.nextInt(100);
            System.out.println("Random Integer generated : " + randomInteger);
            if ((randomInteger % 2) == 0) {
                SquareThread sqthread = new SquareThread(randomInteger);
                sqthread.start();
            } else {
                CubeThread cthread = new CubeThread(randomInteger);
                cthread.start();
            }
            try {
                //Thread.sleep(9000);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException in) {
               //Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted
                System.out.println(in);
            }
        }
    }
}
//simultaneously
class SquareThread extends Thread {

    int number;

    //Constractor
    SquareThread(int randomNumbern) {
        number = randomNumbern;
    }

    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

class CubeThread extends Thread {

    int number;

    CubeThread(int randomNumber) {
        number = randomNumber;
    }

    public void run() {
        System.out.println("Cube of " + number + " = " + number * number * number);
    }
}

public class MultiThreading {

    public static void main(String args[]) {
        RandomNumberThread rnthread = new RandomNumberThread();
        rnthread.start();
    }
}

package lesson25.tasks;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10){
                int random = RandomUtil.getRandom();
                list.add(random);
                System.out.println("producer adds value: " + random + ". Size " + list.size());
                } else {
                    System.out.println("producer does nothing");
                }
//                list.notifyAll();
                try {
                    int randomWaitValue = 20;
                    list.wait(randomWaitValue);
                    System.out.println("producer waits: " + randomWaitValue + "ms");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

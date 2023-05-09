package lesson25.tasks;

import java.util.Queue;

public class ConsumerThread implements Runnable {
    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if(!list.isEmpty()){
                Integer removedValue = list.remove();
                    System.out.println("consumer get value: " + removedValue + ". Size " + list.size());
                } else{
                    System.out.println("consumer is waiting, list is empty");
                }
                try {
                    int random = 80;
                    System.out.println("consumer wait: " + random + "ms");
//                    list.notifyAll();
                    list.wait(RandomUtil.getRandom());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }
        }
    }
}

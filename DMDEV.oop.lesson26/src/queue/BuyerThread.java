package queue;

import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable{


    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take();
            System.out.println(Thread.currentThread().getName() + " ������������� � ����� " + cashbox);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " ���������� ����� " + cashbox);
            cashboxes.add(cashbox);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

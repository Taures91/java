package lesson25.queue;

import java.util.Queue;

public class BuyerThread implements Runnable{


    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            synchronized (cashboxes) {
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " ������������� � ����� " + cashbox);

                        cashboxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + " ���������� ����� " + cashbox);
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ������� ��������� �����");
                        cashboxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

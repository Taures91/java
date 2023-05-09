package lesson25.counter;

public class Counter {

    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        synchronized (this){ //������������� ������� ����
            count++;
        }
    }

    public synchronized void decrement() { //������������� ������
        count--;
    }
}

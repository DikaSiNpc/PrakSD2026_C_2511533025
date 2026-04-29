package TugasPekan4_2511533025;
public class Queue_2511533025 {
    private String[] queue_3025;
    private int front_3025, rear_3025, max_3025;

    // Konstruktor
    public Queue_2511533025(int max) {
        this.max_3025 = max;
        queue_3025 = new String[max];
        front_3025 = -1;
        rear_3025 = -1;
    }

    // Getter
    public int getFront() {
        return front_3025;
    }

    public int getRear() {
        return rear_3025;
    }

    public int getMax() {
        return max_3025;
    }

    public String getQueue(int index) {
        return queue_3025[index];
    }

    // Setter
    public void setFront(int front) {
        this.front_3025 = front;
    }

    public void setRear(int rear) {
        this.rear_3025 = rear;
    }

    public void setQueue(int index, String value) {
        queue_3025[index] = value;
    }

    // Cek kosong
    public boolean isEmpty() {
        return rear_3025 == -1;
    }

    // Cek penuh
    public boolean isFull() {
        return rear_3025 == max_3025 - 1;
    }

    // Enqueue
    public void enqueue_3025(String data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                setFront(0);
            }
            setRear(getRear() + 1);
            setQueue(getRear(), data);
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Dequeue
    public void dequeue_3025() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(getQueue(getFront()) + " telah dilayani");

            if (getFront() == getRear()) {
                setFront(-1);
                setRear(-1);
            } else {
                setFront(getFront() + 1);
            }
        }
    }

    // Display
    public void display_3025() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = getFront(); i <= getRear(); i++) {
                System.out.println((i - getFront() + 1) + ". " + getQueue(i));
            }
        }
    }

    // Reverse
    public void reverse_3025() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int start_3025 = getFront();
            int end_3025 = getRear();

            while (start_3025 < end_3025) {
                String temp = getQueue(start_3025);
                setQueue(start_3025, getQueue(end_3025));
                setQueue(end_3025, temp);

                start_3025++;
                end_3025--;
            }
            System.out.println("Antrian berhasil dibalik");
        }
    }
}
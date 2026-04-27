package Pekan4_2511533025;

public class QueueArrayDriver_2511533025 {
	public static void main(String[] args) {
		QueueArray_2511533025 queue = new QueueArray_2511533025(1000);
		queue.enqueue_3025(10);
		queue.enqueue_3025(20);
		queue.enqueue_3025(30);
		queue.enqueue_3025(40);
        System.out.println("Item di depan "+ queue.front_3025());
        System.out.println("item paling belakang " + queue.rear_3025());
        System.out.println("tampilan queue");
        queue.display_3025();
        System.out.println();
        System.out.println(queue.dequeue_3025() + " dihapus dari queue");
        System.out.println("item di depan: " + queue.front_3025());
        System.out.println("item dibelakang: " + queue.rear_3025());
        System.out.println("tampilan queue setelah satu data dihapus");
        queue.display_3025();
	}
}

package Pekan4_2511533025;

public class QueueArray_2511533025 {
	int front_3025, rear_3025, size_3025;
	int capacity_3025;
	int array_3025[];
	
	public QueueArray_2511533025(int capacity) {
		this.capacity_3025 = capacity;
		front_3025 = this.size_3025 = 0;
		rear_3025 = capacity - 1;
		array_3025 = new int[this.capacity_3025];
	}
	
	boolean isFull(QueueArray_2511533025 queue) {
		return (queue.size_3025 == queue.capacity_3025);
	}
	
	boolean isEmpty(QueueArray_2511533025 queue) {
		return (queue.size_3025 == 0);
	}
	
	void enqueue_3025(int item) {
		if (isFull(this))
			return;
		this.rear_3025 = (this.rear_3025 + 1) % this.capacity_3025;
		this.array_3025[this.rear_3025] = item;
		this.size_3025 = this.size_3025 + 1;
		System.out.println(item + " enqueued to queue");
	}
	
	int dequeue_3025() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array_3025[this.front_3025];
		this.front_3025 = (this.front_3025 + 1) % this.capacity_3025;
		this.size_3025 = this.size_3025 - 1;
		return item;
	}
	int front_3025() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array_3025[this.front_3025];
	}
	int rear_3025() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_3025[this.rear_3025];
	}
	  // mencetak elemen antrian
	void display_3025()  {
		int i; 
		if (front_3025 == rear_3025) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for (i = front_3025; i < rear_3025; i++) {
			System.out.printf(" %d <-- ", array_3025[i]);
		}
		return;
	}

}

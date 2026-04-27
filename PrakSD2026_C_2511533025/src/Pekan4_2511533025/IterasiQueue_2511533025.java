package Pekan4_2511533025;
import java.util.*;
public class IterasiQueue_2511533025 {

	public static void main(String[] args) {
	{
		Queue<String> q_3025 = new LinkedList<>();
		
		q_3025.add("Praktikum");
		q_3025.add("Struktur");
		q_3025.add("Data");
		q_3025.add("Dan");
		q_3025.add("Algoritma");
		Iterator<String> iterator = q_3025.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
		

	}

}

package Pekan4_2511533025;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533025 {
    public static void main(String[] args) {
        Queue<Integer> q_3025 = new LinkedList<Integer>();
        q_3025.add(1);
        q_3025.add(2);
        q_3025.add(3); // [1, 2, 3]
        System.out.println("sebelum reverse " + q_3025);
        Stack<Integer> s_3025 = new Stack<Integer>();
        while (!q_3025.isEmpty()) { // Q -> S
            s_3025.push(q_3025.remove());
        }
        while (!s_3025.isEmpty()) { // S -> Q
            q_3025.add(s_3025.pop());
        }
        System.out.println("sesudah reverse = " + q_3025); // [3, 2, 1]
    }
}
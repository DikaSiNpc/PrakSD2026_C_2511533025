package Pekan3_2511533025;
import java.util.Stack;
public class NilaiMaksimum_2511533025 {
    public static int max(Stack<Integer> s_3025) {
        Stack<Integer> backup_3025 = new Stack<Integer>();
        int maxValue_3025 = s_3025.pop();
        backup_3025.push(maxValue_3025);
        while (!s_3025.isEmpty()) {
            int next = s_3025.pop();
            backup_3025.push(next);
            maxValue_3025 = Math.max(maxValue_3025, next);
        }
        while (!backup_3025.isEmpty()) {
            s_3025.push(backup_3025.pop());
        }
        return maxValue_3025;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(70);
        s.push(12);
        s.push(20);
        System.out.println("isi stack "+s);
        System.out.println("Stack Teratas "+s.peek());
        System.out.println("Nilai maksimum "+max(s));
    }
}
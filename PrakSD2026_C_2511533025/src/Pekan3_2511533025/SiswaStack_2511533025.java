package Pekan3_2511533025;
import java.util.ArrayList;
class Siswa_2511533025 {
	String nama_3025;
	int nim_3025;
	
	public Siswa_2511533025(String nama_3005, int nim_3005) {
		this.nama_3025= nama_3005;
		this.nim_3025= nim_3005;
	}
	
	@Override
	public String toString() {
		return "Nim:" + nim_3025 + ", Nama: "+ nama_3025;
	}

}
public class SiswaStack_2511533025 {
	private ArrayList<Siswa_2511533025> stack;
	
	public SiswaStack_2511533025() {
		stack= new ArrayList<> ();
	}
	
	public void push(Siswa_2511533025 mhs) {
		stack.add(mhs);
	}
    public Siswa_2511533025 pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public Siswa_2511533025 peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void tampilkanSiswa() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
    public static void main(String[] args) {
        SiswaStack_2511533025 studentStack_3025 = new SiswaStack_2511533025();
        
        Siswa_2511533025 mhs1 = new Siswa_2511533025("Ali", 1);
        Siswa_2511533025 mhs2 = new Siswa_2511533025("Boby", 2);
        Siswa_2511533025 mhs3 = new Siswa_2511533025("Charles", 3);
        
        studentStack_3025.push(mhs1);
        studentStack_3025.push(mhs2);
        studentStack_3025.push(mhs3);
        
        System.out.println("Siswa di dalam stack:");
        studentStack_3025.tampilkanSiswa();
        
        System.out.println("Siiswa teratas " + studentStack_3025.peek());
        System.out.println("mengeluarkan siswa teratas dari Stack: " + studentStack_3025.pop());
        System.out.println("daftar siswa setelah di pop: ");
        studentStack_3025.tampilkanSiswa();
    }
}
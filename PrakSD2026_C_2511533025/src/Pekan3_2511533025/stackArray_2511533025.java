package Pekan3_2511533025;
public class stackArray_2511533025 {
	static final int MAX_3025 = 1000;
	int top_3025;
	int a_3025[] = new int[MAX_3025];
	boolean isEmpty_3025() {
		return (top_3025 < 0);
	}
	
	stackArray_2511533025() {
		top_3025 = -1;
	}
	
	boolean push_3025(int x)	{
		if (top_3025 >= (MAX_3025 - 1)) {
			System.out.println("Stack overflow");
			return false;
		} else {
			a_3025[++top_3025] = x;
			System.out.printf("%d dimasukkan dalam stack%n", x);
			return true;
		}
	}
	
	int pop_3025() {
		if (top_3025 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a_3025[top_3025--];
			return x;
		}
	}
	
	int peek_3025() {
		if (top_3025 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a_3025[top_3025];
			return x;
		}
	}
	
	void print_3025() {
		for(int i_3025 = top_3025; i_3025 > -1 ; i_3025--) {
			System.out.print(" " + a_3025[i_3025]);
		}
	}
}
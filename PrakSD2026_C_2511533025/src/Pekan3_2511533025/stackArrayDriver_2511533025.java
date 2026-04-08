package Pekan3_2511533025;
public class stackArrayDriver_2511533025 {
    public static void main(String[] args) {
        stackArray_2511533025 s = new stackArray_2511533025();
        s.push_3025(10);
        s.push_3025(20);
        s.push_3025(30);
        System.out.println(s.pop_3025() + " dikeluarkan dari stack");
        System.out.println("Elemen teratas adalah : " + s.peek_3025());
        System.out.print("Element pada stack :");
        s.print_3025();
        
    }
}
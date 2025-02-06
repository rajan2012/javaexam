public class main3 {


        public static void main(String[] args) {
            int a = -8; // Binary: 1111 1000 (32-bit representation)
            int d = a >>> 2; // Logical right shift by 2 places

            System.out.println("Original number (a): " + a);
            System.out.println("Binary of a: " + Integer.toBinaryString(a));
            System.out.println("After logical right shift (a >>> 2): " + d);
            System.out.println("Binary of d: " + Integer.toBinaryString(d));
        }
    }



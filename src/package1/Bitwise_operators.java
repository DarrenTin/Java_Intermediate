package package1;

public class Bitwise_operators {
	static void test() {
		int a = 5;        // 101
		int b = 3;        // 011
		System.out.println(a & b);  // and = 001
		System.out.println(a | b);  // or = 111 
		System.out.println(a ^ b);  // xor = 110
		System.out.println(~a);  // not = 11111111111111111111111111111010
		System.out.println(b << 2); // left shift = 1100 
		System.out.println((a*2) >> 1); // 1010 => 0101
		System.out.println(a >>> 2); // move and fill leftmost with 0
	}
}

package package1;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Advanced_datatype {
	
	static void testAtomicInteger() {
		AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.incrementAndGet(); // increase 1
        atomicInteger.decrementAndGet(); // decrease 1
        atomicInteger.addAndGet(100); // increase any value
        atomicInteger.addAndGet(-50); // decrease any value
        System.out.println("Value: " + atomicInteger.get());
	}
	
	static void testBigInteger() {
		BigInteger bigInteger1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInteger2 = new BigInteger("987654321098765432109876543210");
        // note: have time try DIY using string divide and conquer
        
        BigInteger sum = bigInteger1.add(bigInteger2);
        BigInteger subtract = bigInteger1.subtract(bigInteger2);
        BigInteger product = bigInteger1.multiply(bigInteger2);
        BigInteger divide = bigInteger2.divide(bigInteger1);

//        BigInteger sum = bigInteger1 + bigInteger2; // error
//        BigInteger subtract = bigInteger1 - bigInteger2; // error
//        BigInteger product = bigInteger1 * bigInteger2; // error
//        BigInteger divide = bigInteger2 / bigInteger1; // error

        System.out.println("Sum: " + sum);
        System.out.println("Subtract: " + subtract);
        System.out.println("Product: " + product);
        System.out.println("Divide: " + divide);
	}
	
	static void testBigDecimal() {
        BigDecimal bigDecimal1 = new BigDecimal("123.456");
        BigDecimal bigDecimal2 = new BigDecimal("789.012");
        
        BigDecimal sumbd = bigDecimal1.add(bigDecimal2);
        BigDecimal productbd = bigDecimal1.multiply(bigDecimal2);

        System.out.println("Sum: " + sumbd);
        System.out.println("Product: " + productbd);
	}
}

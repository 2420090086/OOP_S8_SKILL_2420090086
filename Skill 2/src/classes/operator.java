package classes;

public class operator {

	public static void main(String[] args) {
		int a = 10, b = 5;
        int x = 15, y = 4;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // 15
        System.out.println("a - b = " + (a - b));  // 5
        System.out.println("a * b = " + (a * b));  // 50
        System.out.println("a / b = " + (a / b));  // 2
        System.out.println("a % b = " + (a % b));  // 0

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));   // true
        System.out.println("a < b = " + (a < b));   // false
        System.out.println("a == b = " + (a == b)); // false
        System.out.println("a != b = " + (a != b)); // true

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (x > y): " + ((a > b) && (x > y))); // true
        System.out.println("(a < b) || (x > y): " + ((a < b) || (x > y))); // true
        System.out.println("!(a > b): " + !(a > b)); // false

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int num = 20;
        System.out.println("num = " + num);
        num += 5; // num = num + 5
        System.out.println("num += 5 => " + num);
        num *= 2; // num = num * 2
        System.out.println("num *= 2 => " + num);

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int c = 5;
        System.out.println("c = " + c);
        System.out.println("++c = " + (++c)); // pre-increment
        System.out.println("c++ = " + (c++)); // post-increment
        System.out.println("After post-increment, c = " + c);
        System.out.println("--c = " + (--c)); // pre-decrement

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int p = 5;  // 0101 in binary
        int q = 3;  // 0011 in binary
        System.out.println("p & q = " + (p & q));  // 0001 = 1
        System.out.println("p | q = " + (p | q));  // 0111 = 7
        System.out.println("p ^ q = " + (p ^ q));  // 0110 = 6
        System.out.println("~p = " + (~p));        // bitwise NOT

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
		// TODO Auto-generated method stub

	}

}

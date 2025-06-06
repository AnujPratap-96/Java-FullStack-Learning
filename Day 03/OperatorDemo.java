public class OperatorDemo {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = 5;
        x += 3;
        System.out.println("x += 3: " + x);
        x -= 2;
        System.out.println("x -= 2: " + x);
        x *= 2;
        System.out.println("x *= 2: " + x);
        x /= 2;
        System.out.println("x /= 2: " + x);
        x %= 2;
        System.out.println("x %= 2: " + x);

        // 3. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 4. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean cond1 = (a > b);
        boolean cond2 = (a < b);
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int y = 5;
        System.out.println("y = " + y);
        System.out.println("++y = " + (++y));
        System.out.println("y++ = " + (y++));
        System.out.println("--y = " + (--y));
        System.out.println("y-- = " + (y--));
        System.out.println("Final y = " + y);

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int m = 5, n = 3; // in binary: 101, 011
        System.out.println("m & n: " + (m & n)); // 001 => 1
        System.out.println("m | n: " + (m | n)); // 111 => 7
        System.out.println("m ^ n: " + (m ^ n)); // 110 => 6
        System.out.println("~m: " + (~m));       // Invert bits
        System.out.println("m << 1: " + (m << 1)); // 1010 => 10
        System.out.println("m >> 1: " + (m >> 1)); // 10 => 2

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // 8. instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));

        // 9. Type Casting
        System.out.println("\nType Casting:");
        double d = 9.78;
        int casted = (int) d;  // Narrowing casting
        System.out.println("Casted double to int: " + casted);
        int intVal = 100;
        double widened = intVal;  // Widening casting
        System.out.println("Widened int to double: " + widened);
    }
}

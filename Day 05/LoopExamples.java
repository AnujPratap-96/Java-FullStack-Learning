public class LoopExamples {
    public static void main(String[] args) {

        // 1. for loop
        System.out.println("1. for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. while loop
        System.out.println("\n2. while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 3. do-while loop
        System.out.println("\n3. do-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // 4. for-each loop
        System.out.println("\n4. for-each loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }

        // 5. break example
        System.out.println("\n5. break statement:");
        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                System.out.println("Breaking at m = 3");
                break;
            }
            System.out.println("m = " + m);
        }

        // 6. continue example
        System.out.println("\n6. continue statement:");
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                System.out.println("Skipping n = 3");
                continue;
            }
            System.out.println("n = " + n);
        }
    }
}

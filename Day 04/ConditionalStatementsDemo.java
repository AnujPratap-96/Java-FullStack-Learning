public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        int age = 20;
        int marks = 75;
        int day = 3;
        boolean hasID = true;

        // 1. if statement
        System.out.println("1. if Statement:");
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // 2. if-else statement
        System.out.println("\n2. if-else Statement:");
        if (age < 18) {
            System.out.println("You cannot vote.");
        } else {
            System.out.println("You can vote.");
        }

        // 3. if-else if-else ladder
        System.out.println("\n3. if-else if-else Ladder:");
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // 4. Nested if
        System.out.println("\n4. Nested if Statement:");
        if (age >= 18) {
            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("ID required for entry.");
            }
        } else {
            System.out.println("Underage - Entry not allowed.");
        }

        // 5. switch statement
        System.out.println("\n5. switch Statement:");
        switch (day) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

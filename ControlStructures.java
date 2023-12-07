
public class ControlStructures {
    public static void main(String[] args) {
        // If-else statement
        int num = 10;
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Switch statement
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Fail");
        }

        // While loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }

        // For loop
        for (int j = 1; j <= 5; j++) {
            System.out.println("Count: " + j);
        }

        // Do-while loop
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++;
        } while (k <= 5);

        // Break statement
        for (int x = 1; x <= 10; x++) {
            if (x == 5) {
                break;
            }
            System.out.println("Number: " + x);
        }

        // Continue statement
        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue;
            }
            System.out.println("Number: " + y);
        }
    }
}

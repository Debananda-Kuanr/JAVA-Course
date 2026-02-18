import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Number of Fibonacci Series You want to print: ");
        int n = in.nextInt();

        int a = 0, b = 1, c;

        if (n <= 0) {
            System.out.println("Invalid input");
        } 
        else if (n == 1) {
            System.out.println("0");
        } 
        else {
            System.out.print("0 1 ");

            for (int i = 0; i < n - 2; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }

        in.close();
    }
}

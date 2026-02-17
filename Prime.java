import java.util.Scanner;
import static java.lang.Math.*;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = in.nextInt();

        if (num <= 1)
            System.out.println("It is not a Prime Number");
        else {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println("It is a prime Number");
            else
                System.out.println("it is not a prime Number ");
        }
        in.close();
    }
}

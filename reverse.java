//Reverse a Number
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
        System.out.println("Enter a non Zero Number:");
        int num= in.nextInt();
        int rem,rev=0;
        while (num!=0) {
            rem= num%10;
            num = num/10;
            rev = rev*10 + rem;
        }
        System.out.println("After reverse the number is "+rev);
        in.close();
    }
}

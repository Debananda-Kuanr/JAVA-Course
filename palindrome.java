import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in); 
        System.out.print("Enter a Number:");
        int num= in.nextInt();
        int rem,rev=0,Copy_num=num;
        while (num!=0) {
            rem= num%10;
            num = num/10;
            rev = rev*10 + rem;
        }
       if (Copy_num==rev) 
        System.out.println(Copy_num+" is a palindrome Number");
       else
        System.out.println(Copy_num+" is not a palindrome Number");
        in.close();
    }
}

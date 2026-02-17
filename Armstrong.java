import java.util.Scanner;
import static java.lang.Math.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,temp,sum=0,rem,count=0;
        System.out.print("Enter a number:");
        num=in.nextInt();
        temp=num;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        temp=num;
        while(temp!=0){
            rem = temp%10;
            sum = sum + (int)Math.pow(rem, count);
            temp = temp / 10;
        }
        if(sum == num )
            System.out.println(num+" is Armstrong Number");
        else
            System.out.println(num+" is not Armstrong Number");


    }
}

//even odd counter

import java.util.Scanner;
public class odd_even {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int num,even=0,odd=0;
    for(int i= 0;i<10;i++){
       System.out.println("Enter number " + (i+1) + ":");
        num = in.nextInt();
        if(num%2==0)
            even++;
        else
            odd++;

    }
    System.out.println("Total even number:"+even);
    System.out.println("Total Odd number:"+odd);
   in.close();

}
}
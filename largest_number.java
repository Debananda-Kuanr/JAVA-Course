//Largest of N numbers
import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();    
        int[] arr = new int[n];

        System.out.println("Enter the Elements:");
        for(int i=0 ; i<n;i++)
            arr [i]=in.nextInt();

        int largest = arr[0];
        for(int i=0 ; i<n;i++){
            if(arr[i]>=largest)
                largest= arr[i];
        }
        System.out.println("The largest Number is "+largest);
        in.close();
    }
}

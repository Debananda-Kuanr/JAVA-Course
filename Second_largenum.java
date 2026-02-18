import java.util.Scanner;

public class Second_largenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of Element in array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements:");

        if (n < 2) {
            System.out.println("Not enough elements");
        }

        else {
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int largest = arr[0];
            int second_largest = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > largest) {
                    second_largest = largest;
                    largest = arr[i];
                } else if (arr[i] > second_largest && arr[i] < largest) {
                    second_largest = arr[i];
                } else {
                    continue;
                }

            }
            if (second_largest == Integer.MIN_VALUE) { // ✅ Added safety check
                System.out.println("No second largest element");
            } else {
                System.out.println("The second largest Number is " + second_largest);
            }
        }
        in.close();
    }
}

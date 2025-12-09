import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       Arrays.sort(arr);
        System.out.println("Second largest element: " + arr[n-2]);
    }
}

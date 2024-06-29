import java.util.Arrays;
import java.util.Scanner;

public class arr {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
  System.out.println("Enter rotation : ");
        int num = sc.nextInt();
 rotate(arr, num);
        System.out.println(Arrays.toString(arr));
    }
     private static void rotate(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

}
}

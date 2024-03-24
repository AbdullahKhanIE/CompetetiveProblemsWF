import java.util.Scanner;

public class A144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxNum = arr[0], maxIndex = 0, minNum = arr[0], minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
            if (arr[i] <= minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }
        if (maxIndex > minIndex)
            minIndex++;
        System.out.println(maxIndex + n - minIndex - 1);
    }
}

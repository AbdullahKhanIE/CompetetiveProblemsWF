import java.util.Scanner;

public class A158 {
    public static void main(String[] args) {
        int n, k, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            if(arr[i]>=arr[k-1] && arr[i]>0)
            ++count;
        }
        System.out.println(count);
    }
}

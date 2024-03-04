import java.util.*;

public class A381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c1 = 0, c2 = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1,j=0,k=(n-1); i <= n; i++) {
            if(arr[j]>arr[k]){
                if(i%2!=0)
                    c1+=arr[j];
                else
                    c2+=arr[j];
                j++;
            }
            else{
                if(i%2!=0)
                    c1+=arr[k];
                else
                    c2+=arr[k];
                k--;
            }
        }
        System.out.println(c1+" "+c2);
    }
}

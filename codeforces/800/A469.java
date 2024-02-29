import java.util.*;

public class A469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n+1];
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int j=sc.nextInt();
            arr[j]=1;
        }
        int b=sc.nextInt();
        for(int i=0;i<b;i++){
            int j=sc.nextInt();
            arr[j]=1;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(arr[i]!=1)
                count++;
        }
        if(count==0)
        System.out.println("I become the guy.");
        else
        System.out.println("Oh, my keyboard!");
    }
}

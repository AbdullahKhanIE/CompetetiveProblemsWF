import java.util.*;
public class A344 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        for(int i=0, temp=0;i<n;i++){
            int k=sc.nextInt();
            if(k!=temp && i!=0)
            count++;
            temp=k;
        }
        sc.close();
        System.out.println(++count);
    }
}

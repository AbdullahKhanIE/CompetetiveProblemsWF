import java.util.*;
public class A116 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        for(int i=0,a,b,sum=0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            sum+=b-a;
            if(sum>max)
                max=sum;
        }
        sc.close();
        System.out.println(max);
    }
}

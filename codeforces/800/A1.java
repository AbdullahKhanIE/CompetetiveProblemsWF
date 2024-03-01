import java.util.*;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong(),m=sc.nextLong(), a=sc.nextLong(), l,b;
        sc.close();
        l=n/a;
        b=m/a;
        if(n%a!=0)
            l++;
        if(m%a!=0)
            b++;
        System.out.println(l*b);
        
    }
}

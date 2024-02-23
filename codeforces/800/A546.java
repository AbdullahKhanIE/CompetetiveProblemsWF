import java.util.*;
public class A546 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt(),n=sc.nextInt(),w=sc.nextInt(), sum=0;
        sc.close();
        for(int i=1;i<=w;i++){
            sum+=(k*i);
        }
        if(sum>n){
            System.out.println(sum-n);
        }
        else 
        System.out.println("0");
    }
}

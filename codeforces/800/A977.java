import java.util.*;
public class A977 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        sc.close();
        for(int i=0;i<y;i++){
            if(x%10==0)
                x/=10;
            else
                x--;
        }
        System.out.println(x);
    }
}

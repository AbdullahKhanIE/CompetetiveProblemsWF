import java.util.*;
public class A1703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String j=sc.nextLine().toUpperCase();
            if(j.equals("YES"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

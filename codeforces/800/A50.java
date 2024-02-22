import java.util.Scanner;;
public class A50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        sc.close();
        y*=x;
        if (x!=0) 
            System.out.println(y/2);
    }
}

import java.util.*;

public class A1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            if (x % y == 0)
                System.out.println("0");
            else
                System.out.println(y - (x % y));
        }
        sc.close();
    }
}

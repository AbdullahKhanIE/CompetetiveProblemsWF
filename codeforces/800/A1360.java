import java.util.*;

public class A1360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            int x = Math.max(2 * a, b), y = Math.max(2 * b, a);
            if (x < y)
                System.out.println(x * x);
            else
                System.out.println(y * y);
        }
        sc.close();
    }
}

import java.util.*;

public class A723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        sc.close();
        if (x > y && x > z) {
            if (y > z)
                System.out.println(x - z);
            else
                System.out.println(x - y);
        } else if (y > x && y > z) {
            if (x > z)
                System.out.println(y - z);
            else
                System.out.println(y - x);
        } else if (z > y && z > x) {
            if (y > x)
                System.out.println(z - x);
            else
                System.out.println(Math.abs(z - y));
        }

    }
}
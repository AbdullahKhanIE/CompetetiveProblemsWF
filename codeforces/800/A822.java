import java.util.*;

public class A822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        if (x > y) {
            for (int i = y - 1; i >= 1; i--) {
                y *= i;
            }

            System.out.println(y);
        }
        else {
            for (int i = x - 1; i >= 1; i--) {
                x *= i;
            }

            System.out.println(x);
        }

    }
}

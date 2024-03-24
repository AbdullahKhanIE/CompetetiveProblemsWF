import java.util.Scanner;

public class A705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                if (i % 2 == 0) {
                    System.out.print("I love that ");
                } else {
                    System.out.print("I hate that ");
                }
            } else {
                if (i % 2 == 0) {
                    System.out.print("I love it");
                } else {
                    System.out.print("I hate it");
                }
            }

        }
    }
}

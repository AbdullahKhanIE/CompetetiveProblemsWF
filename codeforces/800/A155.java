import java.util.Scanner;

public class A155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int min = sc.nextInt();
        int max = min;
        for (int i = 1; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                max = temp;
                ans++;
            } else if (temp < min) {
                min = temp;
                ans++;
            }
        }
        System.out.println(ans);
    }
}

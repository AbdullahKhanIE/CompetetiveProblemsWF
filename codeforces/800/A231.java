import java.util.Scanner;

public class A231 {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] result = new int[n][3];
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < 3; j++) {
                result[i][j] = sc.nextInt();
                if (result[i][j] == 1)
                    temp += result[i][j];
            }
            if (temp > 1)
                count++;
        }
        sc.close();
        System.out.println(count);
    }
}

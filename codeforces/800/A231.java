import java.util.Scanner;

public class A231 {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] result = new int[n][3];
        for (int i = 0; i < n; i++) {
            int name = 0;
            for (int j = 0; j < 3; j++) {
                result[i][j] = sc.nextInt();
                if (result[i][j] == 1)
                    name += result[i][j];
            }
            if (name > 1)
                count++;
        }
        sc.close();
        System.out.println(count);
    }
}

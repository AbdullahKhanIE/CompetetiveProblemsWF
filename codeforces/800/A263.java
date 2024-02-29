import java.util.Scanner;
public class A263 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int i1 = 0, i2 = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    i1 = i;
                    i2 = j;
                }
            }
        }
        sc.close();
        System.out.println(Math.abs(i1-2)+Math.abs(i2-2));
    }
}

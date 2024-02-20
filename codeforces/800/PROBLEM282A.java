import java.util.Scanner;

public class PROBLEM282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String arr;
            arr = sc.nextLine();
            if (arr.equals("++X") || arr.equals("X++"))
                count++;
            else
                count--;
        }
        System.out.println(count);

    }
}

import java.util.*;;

public class A677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt(), w = 0;
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            if ((float)j /  h <= 1)
                w++;
            else
                w += 2;
        }
        sc.close();
        System.out.println(w);
    }
}

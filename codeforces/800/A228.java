import java.util.*;

public class A228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] s = new long[4];
        for (int i = 0; i < 4; i++) {
            s[i] = sc.nextLong();
        }
        Arrays.sort(s);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (s[i] == s[i + 1])
                count++;
        }
        System.out.println((count));
    }
}
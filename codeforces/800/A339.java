import java.util.Scanner;
import java.util.Arrays;
public class A339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sum = sc.nextLine();
        sc.close();
        char[] name = sum.toCharArray();
        Arrays.sort(name);
        char[] sort = new char[sum.length()];
        for (int i = 0, j = 0; i < sum.length(); i++) {
            if (name[i] != '+') {
                sort[j] = name[i];
                j++;
                if (j <= i) {
                    sort[j] = '+';
                    j++;
                }
            }
        }
        System.out.println(sort);
    }
}

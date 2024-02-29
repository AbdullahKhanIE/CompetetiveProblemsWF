import java.util.*;

public class A61 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(), y = sc.nextLine();
        sc.close();
        for (int i = 0; i < x.length(); i++) {
            if ((x.charAt(i) == '0' && y.charAt(i) == '1') || (x.charAt(i) == '1' && y.charAt(i) == '0'))
                System.out.print('1');
            else
                System.out.print('0');
        }
    }
}

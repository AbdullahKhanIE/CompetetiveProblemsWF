import java.util.*;

public class A118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().toLowerCase();
        sc.close();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != 'a' && n.charAt(i) != 'e' && n.charAt(i) != 'i' && n.charAt(i) != 'o'
                    && n.charAt(i) != 'u' && n.charAt(i) != 'y')
                System.out.print("." + n.charAt(i));
        }
    }
}
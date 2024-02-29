import java.util.*;

public class A41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        int n = a.length() - 1, count = 0;
        sc.close();

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(n))
                    count++;
                n--;
            }
            if (count == a.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        } 
        else
            System.out.println("NO");
    }
}

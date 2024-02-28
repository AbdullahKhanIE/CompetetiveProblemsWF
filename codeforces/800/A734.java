
import java.util.*;

public class A734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, d = 0;
        sc.nextLine();
        String name = sc.nextLine().toUpperCase();
        for (int i = 0; i < n; i++) {
            if (name.charAt(i) == 'D')
                d++;
            else
                a++;
        }
        if (a == d)
            System.out.println("Friendship");
        else if (a > d)
            System.out.println("Anton");
        else
            System.out.println("Danik");
    }
}

import java.util.*;
public class A59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        sc.close();
        int x = 0, y = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) >= 65 && word1.charAt(i) <= 90)
                x++;
            else
                y++;
        }
        if (x > y)
            System.out.println(word1.toUpperCase());
        else
            System.out.println(word1.toLowerCase());
    }
}

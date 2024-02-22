import java.util.*;
public class A236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String name = "";
        for (int i = 0; i < input.length(); i++) {
            int blank = 0;
            char nameChar = input.charAt(i);
            for (int s = 0; s < name.length(); s++) {
                if (nameChar == name.charAt(s))
                    blank++;
            }
            if (blank == 0)
                name += nameChar;
        }
        if (name.length() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}

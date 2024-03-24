import java.util.*;

public class A271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        while (!areDigitsUnique(n)) {
            n++;
        }
        System.out.println(n);
    }

    public static boolean areDigitsUnique(int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            for (int j = i + 1; j < numStr.length(); j++) {
                if (numStr.charAt(i) == numStr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
import java.util.Scanner;
public class PROBLEM112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine().toLowerCase();
        String word2 = sc.nextLine().toLowerCase();
        sc.close();
        if (word1.equals(word2))
            System.out.println("0");
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) > word2.charAt(i)) {
                System.out.println("1");
                break;
            } else if (word1.charAt(i) < word2.charAt(i)) {
                System.out.println("-1");
                break;
            }
        }
    }
}
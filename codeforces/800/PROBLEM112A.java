import java.util.Scanner;

public class PROBLEM112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        for (int i = 0; i < word1.length(); i++) 
            count1 += (int) word1.charAt(i);
        for (int i = 0; i < word2.length(); i++) 
            count2 += (int) word2.charAt(i);
        if (count1 == count2)
            System.out.println("0");
        else if (count1 < count2)
            System.out.println("-1");
        else if (count2 < count1)
            System.out.println("1");
            
        sc.close();
    }
}
import java.util.Scanner;

public class A71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] word= new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = sc.nextLine();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            int index = word[i].length();
            String temp = word[i];
            if (index > 10)
                System.out.println(temp.charAt(0) + Integer.toString(index - 2) + temp.charAt(index - 1));
            else
                System.out.println(temp);
        }

    }
}

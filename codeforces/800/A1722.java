import java.util.*;

public class A1722 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "Timur", input;
        char[] arr1= name.toCharArray();
        Arrays.sort(arr1);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            sc.nextLine();
            input = sc.nextLine();
            char[] arr2=input.toCharArray();
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2) && j == name.length()) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        sc.close();
    }

}

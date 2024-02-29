import java.util.*;
public class A266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String color = sc.nextLine();
        sc.close();
        int count=0;
        for(int i = 0;i< color.length()-1;i++){
            if(color.charAt(i)==color.charAt(i+1))
            count++;
        }
        System.out.println(count);
    }
}

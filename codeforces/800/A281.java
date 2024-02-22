import java.util.Scanner;
public class A281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        sc.close();
        char[] cap=word.toCharArray();
        if(cap[0]>=97 || cap[0]<=122){
            cap[0]=Character.toUpperCase(cap[0]);
            System.out.println(cap);
        }
        else
            System.out.println(cap);
    }
}

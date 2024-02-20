import java.util.Scanner;
public class A791 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),count=0;
        while(a<=b){
            a*=3;
            b*=2;
            count++;
        }
        System.out.println(count);
    }
}
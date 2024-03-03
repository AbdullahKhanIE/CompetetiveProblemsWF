package unfinished;
import java.util.*;

public class B1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), count = 0,n=1;
        for (int i = 0; i < k && n>0; i++) {
             n = sc.nextInt();
            if (n >= 15 && (n / 15 == 10 || n / 15 == 6 || n / 15 == 3)) {
                count = n / 15;
                n /= 15;
            } else if (n >= 10 && (n / 10 == 6 || n / 10 == 3) && n<15) {
                count += n / 10;
                n /= 10;
            } else if (n >= 6 && (n / 6 == 3) && n<10) {
                count += n / 6;
                n /= 6;
            } else if (n >= 3 && (n / 3 == 1) && n<6) {
                count += n / 3;
                n /= 3;
            } else if (n > 0 && n<3) {
                count++;
                n--;
            }
            // if(n>=15){
            // if(n%15==0){
            // count=n/15;
            // n/=15;
            // }
            // else if(n%10==0)
            // }

        }
        System.out.println(count);

    }
}

import java.util.Scanner;
public class A4 {
  public static void main(String[] args) {
    int w;
    Scanner sc= new Scanner(System.in);
    w=sc.nextInt();
    if(w%2==0 && w>2 && w<=100)
      System.out.println("YES");
    else
      System.out.println("NO");
    sc.close();
  }
}
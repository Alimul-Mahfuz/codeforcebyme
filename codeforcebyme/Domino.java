import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
       int m,n;
       Scanner sc = new Scanner(System.in);
       m=sc.nextInt();
       n=sc.nextInt();
       sc.close();
       int res=(m*n)/2;
       System.out.println(res);
    }
}

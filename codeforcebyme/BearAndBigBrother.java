import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,p;
        n=sc.nextInt();
        p=sc.nextInt();
        int i=0;
        while(n<=p){
            n=n*3;
            p=p*2;
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}

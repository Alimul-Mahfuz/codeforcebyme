
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long last;
        int count=0;
        if(n%10==n){
            System.out.println("NO");
        }
        else{
            do{
                last=n%10;
                if(last==4||last==7){
                    count++;
                }
                n=n/10;
            }while(n>0);
            if(count==7 || count==4){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        sc.close();

    }
}

import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n/100!=0){
            sum=sum+(n/100);
            n=n%100;
        }
        if(n/20!=0){
            sum=sum+(n/20);
            n=n%20;
        }
        if(n/10!=0){
            sum=sum+(n/10);
            n=n%10;
        }
        if(n/5!=0){
            sum=sum+(n/5);
            n=n%5;
        }
        if(n/1!=0){
            sum=sum+(n/1);
        }

        System.out.println(sum);
        sc.close();
        
    }
}

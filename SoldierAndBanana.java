import java.util.Scanner;

public class SoldierAndBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,n,w;
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        int sum=0;
        for(int i=1;i<=w;i++){
            sum=sum+(i*k);
        }
        if(sum>n){
            System.out.println(sum-n);
        }
        else{
            System.out.println(0);
        }
    }
}

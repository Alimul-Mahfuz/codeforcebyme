import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+sc.nextInt();
        }
        System.out.printf("%.12f",(double)sum/n);
        sc.close();
        
    }
}

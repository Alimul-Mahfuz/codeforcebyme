import java.util.Scanner;

public class NewYearandHurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int totalmin=0;
        int numprob=0;
        for(int i=1;i<=a;i++){
            totalmin+=5*i;
            if(totalmin+b<=240){
                numprob++;
            }
        }
        System.out.println(numprob);
        sc.close();
    }
}

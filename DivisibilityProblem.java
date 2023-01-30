import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int a,b,stp;
        for(int i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            stp=0;
            while(a%b!=0){
                a++;
                stp++;
            }
            System.out.println(stp);
            
        }
        sc.close();
    }
}

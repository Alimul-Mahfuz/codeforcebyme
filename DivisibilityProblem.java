import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t=sc.nextLong();
        long a,b,stp;
        for(int i=0;i<t;i++){
            stp=0;
            a=sc.nextLong();
            b=sc.nextLong();
            if(a%b==0){
                stp=0;
                System.out.println(stp);
            }
            else{
                stp=b-(a%b);
                System.out.println(stp);
            }
            
        }
        sc.close();
    }
}

import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            if(n==2){
                int d1=sc.nextInt();
                int d2=sc.nextInt();
                if(d1==d2){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

            }
            else{
            int canOne=0;
            int canTwo=0;
            for(int i=0;i<n;i++){
                int weight=sc.nextInt();
                if(weight==1){
                    canOne++;
                }
                else{
                    canTwo++;
                }
            }
            if(canOne==canTwo){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            }
            t--;
            sc.close();

        }
    }
}

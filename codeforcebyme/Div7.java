import java.util.Scanner;

public class Div7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        for(int i=1;i<=t;i++){
            c=sc.nextInt();
            if(c%7!=0){
                c=c-(c%10);
                while(c%7!=0){
                    c++;
                }
                System.out.println(c);
            }
            else{
                System.out.println(c);
            }
        }
        sc.close();
    }
}

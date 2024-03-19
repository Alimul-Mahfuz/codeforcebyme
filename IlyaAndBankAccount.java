import java.util.Scanner;
public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println(a);
            return;
        }
        int last;
        int beforelast;
        last=a%10;
        beforelast=(-1)*(a/10)%10;
        String num= Integer.toString(10);
        System.out.println(num);
        int len=num.length();
        if(last>beforelast){
            if(len<2){
                System.out.println(beforelast);
                return;
            }
            int numA=Integer.parseInt(num.substring(0, len-1));
            System.out.println(numA);
            return;

        }else{
            if(len<2){
                System.out.println(last);
                return;
            }
            int numB=Integer.parseInt(num.substring(0, len-2));
            System.out.println(numB);
            return;
        }

        
        

    }
}

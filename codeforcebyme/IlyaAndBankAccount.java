import java.util.Scanner;
public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        if(a>0){
            System.out.println(a);
            return;
        }
        int last;
        int beforelast;
        last=(-1)*a%10;
        beforelast=(-1)*(a/10)%10;
        String num= Integer.toString(Math.abs(a));
        int len=num.length();
        if(len==2){
            if(last>beforelast){
                System.out.println(beforelast*(-1));
                return;
            }
            else{
                System.out.println(last*(-1));
                return;
            }
        }
        else{
            if(last>beforelast){
                String numf=num.substring(0, len-1);
                System.out.println((-1)*Integer.parseInt(numf));
                return;
            }
            else{
                String num1=num.substring(0, len-2);
                String num2=num.substring(len-1, len);
                String numf=num1.concat(num2);
                System.out.println((-1)*Integer.parseInt(numf));
                return;
            }
        }
        
        

        
        

    }
}

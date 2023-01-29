import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num1=sc.nextLine().toCharArray();
        char[] num2=sc.nextLine().toCharArray();
        char[] fn=new char[num1.length];
        for(int i=0;i<num1.length;i++){
            if(num1[i]=='1' &&num2[i]=='1'){
                fn[i]='0';
            }
            else if(num1[i]=='1' &&num2[i]=='0' || num2[i]=='1'&&num1[i]=='0'){
                fn[i]='1';
            }
            else{
                fn[i]='0';
            }
        }
        String sg=new String(fn);
        System.out.println(sg);
        sc.close();
    }
}

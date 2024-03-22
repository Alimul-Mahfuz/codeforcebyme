import java.util.Scanner;

public class WrongSubstraction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        // 512mod10 will be last digit 2, and 512mod100 will be last two digit 12
        for(int i=0;i<k;i++){
            if(num%10==0){
                num=num/10;
            }
            else{
                num=num-1;
            }
        }
        System.out.println(num);
        sc.close();
    }
}

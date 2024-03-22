import java.util.Scanner;

public class YESorYES{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String si=sc.nextLine();
            if(si.equalsIgnoreCase("YES")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();

    }
}
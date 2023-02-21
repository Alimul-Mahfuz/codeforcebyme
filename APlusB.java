
import java.util.Scanner;
public class APlusB {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t>0){
            String sg=sc.nextLine();
            char[] ch=sg.toCharArray();
            int res=Character.getNumericValue(ch[0])+Character.getNumericValue(ch[2]);  
            System.out.println(res);
            t--;
        }
        sc.close();

    }
}

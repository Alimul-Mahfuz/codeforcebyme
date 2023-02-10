import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int x=0;
        for(int i=0;i<n;i++){
            String data=sc.nextLine();
            if(data.contains("++")){
                x++;
            }
            else if(data.contains("--")){
                x--;
            }
            
        }
        System.out.println(x);
        sc.close();
        
    }
}

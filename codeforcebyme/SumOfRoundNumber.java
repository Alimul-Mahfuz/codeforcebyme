import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int step=0;
            if(n%10!=0){
                arr.add(n%10);  
                n=n-(n%10); 
                step++;
            }
            if(n%100!=0){
                arr.add(n%100); 
                n=n-(n%100);
                step++;
            }
            if(n%1000!=0){
                arr.add(n%1000); 
                n=n-(n%1000);
                step++;
            }
            
            if(n%10000!=0){
                arr.add(n%10000); 
                n=n-(n%10000);
                step++;
            }
            if(n%100000!=0){
                arr.add(n%100000); 
                step++;
    
            }
            System.out.println(step);
            for(Integer j : arr){
                System.out.print(j+" ");
            }
            System.out.println();
            arr.clear();
        }
        sc.close();
    }
}
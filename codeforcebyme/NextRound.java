import java.util.ArrayList;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        int n,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int count=0;
        // System.out.println(list.get(p-1));
        for(Integer i:list){
            // System.out.println(i);
            if(i>0 && i>=list.get(p-1)){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

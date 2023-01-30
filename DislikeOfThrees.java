import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<t;i++){
            int k=list.get(i);
            int j=0;
            for(j=1;j<=k;j++){
                if(j%3==0||j%10==3){
                    k++;
                }
            }
            System.out.println(j-1);
        }
        sc.close();
        
    }
}

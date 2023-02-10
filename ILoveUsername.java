import java.util.ArrayList;
import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(0);
        }
        else{
            ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int a=list.get(0);
        int b=list.get(1);
        int max=a>=b?a:b;
        int min=a<=b?a:b;
        int ap=1;
        for(int i=2;i<n;i++){
            if(max<list.get(i)){
                ap++;
                max=list.get(i);
            }
            else if(min>list.get(i)){
                ap++;
                min=list.get(i);
            }
        }
        System.out.println(ap);
        }



    }
}

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int h=sc.nextInt();
        int width=0;
        int[] ph=new int[t];
        for(int i=0;i<t;i++){
            ph[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            if(ph[i]>h){
                width=width+2;
            }
            else{
                width=width+1;
            }
        }
        System.out.println(width);
        sc.close();

    }
}

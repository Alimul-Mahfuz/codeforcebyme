import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] prb=new int [n];
        for(int i=0;i<n;i++){
            prb[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(prb[i]==0){
                continue;
            }
            else if(prb[i]==1){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }

        sc.close();
    }
}

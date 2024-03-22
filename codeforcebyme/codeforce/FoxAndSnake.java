import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,c;
        n=sc.nextInt();
        c=sc.nextInt();
        int b=0;
        for(int i=1;i<n+1;i++){
            if(i%2!=0){
                for(int j=0;j<c;j++){
                    System.out.print("#");
                }
            }
            else{
                if(b==0){
                    for(int k=0;k<c-1;k++){
                        System.out.print(".");
                    }
                    System.out.print("#");
                    b=1;
                    
                }
                else if(b==1){
                    System.out.print("#");
                    for(int l=1;l<c;l++){
                        System.out.print(".");
                        b=0;
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

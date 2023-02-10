import java.util.Scanner;
public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        boolean iscolor=false;
        char matrix;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix=sc.next().charAt(0);
                if(matrix=='C'||matrix=='M'||matrix=='Y'){
                    iscolor=true;
                    break;
                }
                
            }
        }

        if(iscolor){
            System.out.println("#Color");
        }
        else{
            System.out.println("#Black&White");
        }
        sc.close();
        

    }
}

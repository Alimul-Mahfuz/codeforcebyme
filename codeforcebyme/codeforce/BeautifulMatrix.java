
import java.util.Scanner;

public class BeautifulMatrix {
  
    public static void main(String[] args) {
        int [][] arr=new int[5][5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int rows=0;
        int cols=0;
        for(int j=0;j<5;j++){
            for(int k=0;k<5;k++){
                if(arr[j][k]==1){
                    if(k!=2){
                        rows=Math.abs((k-2));
                    }
                }
            }

        }
        for(int j=0;j<5;j++){
            for(int k=0;k<5;k++){
                if(arr[j][k]==1){
                    if(j!=2){
                        cols=Math.abs((j-2));
                    }
                }
            }

        }
        System.out.println(rows+cols);

    }
}

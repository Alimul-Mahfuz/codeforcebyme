import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]+arr[1]==arr[2]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

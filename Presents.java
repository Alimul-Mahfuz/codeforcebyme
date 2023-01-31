import java.util.ArrayList;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int gift[]=new int[n];
        for(int i=1;i<=n;i++){
            gift[arr[i-1]-1]=i;
        }
        for(int i:gift){
            System.out.print(i+" ");
        }
        sc.close();
    }
}

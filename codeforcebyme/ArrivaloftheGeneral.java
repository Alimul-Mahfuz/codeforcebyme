
import java.util.Scanner;

public class ArrivaloftheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        if(arr.length==1){
            System.out.println(0);
        }
        else{
            int maxi=0,mini=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[maxi]){
                    maxi=i;
                }
                if(arr[i]<=arr[mini]){
                    mini=i;
                }
            }
            if(maxi<mini){
                System.out.println(maxi+(arr.length-1)-mini);
            }
            else if(maxi>mini){
                System.out.println(maxi+(arr.length-1)-mini-1);
            }
        }
        sc.close();
    }
}

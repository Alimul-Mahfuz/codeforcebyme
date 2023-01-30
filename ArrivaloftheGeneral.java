
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
        else if(arr.length==2){
            if(arr[0]>arr[1]){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        else{
            int maxi=0,mini=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[maxi]){
                    maxi=i;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]<arr[mini]){
                    mini=i;
                }
            }
            int mswap=0,minswap=0;
            for(int i=maxi;i>0;i--){
                
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                mswap++;
            }
            int newmini=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<arr[newmini]){
                    newmini=i;
                }
            }
            for(int i=newmini;i<n-1;i++){
                
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                minswap++;
            }
            if(maxi<mini){
                System.out.println(minswap+mswap);
            }
            else if(maxi>mini){
                System.out.println(minswap+mswap-1);
            }
        }

        

    }
}

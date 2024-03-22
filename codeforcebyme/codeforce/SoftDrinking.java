import java.util.Scanner;

public class SoftDrinking {

    public static int FindMin(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,l,c,d,p,nl,np;
        n=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        p=sc.nextInt();
        nl=sc.nextInt();
        np=sc.nextInt();
        int drink=k*l;
        int toast=drink/nl;
        int lime=c*d;
        int ttos=p/np;
        int [] arr={toast,lime,ttos};
        int min=FindMin(arr);
        System.out.println(min/n);
        sc.close();
      
    }
}

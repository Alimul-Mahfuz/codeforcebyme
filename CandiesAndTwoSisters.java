import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2 || arr[i]==1){
                System.out.println(0);
            }
            else{
                int fn=arr[i]/2;
                int count=0;
                for(int j=1;j<=fn;j++){
                    int a=arr[i]-j;
                    if(a>j){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}

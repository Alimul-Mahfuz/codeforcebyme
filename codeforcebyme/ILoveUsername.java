import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                sum++;
            }
            else if(min>arr[i]){
                min=arr[i];
                sum++;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

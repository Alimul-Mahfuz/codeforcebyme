import java.util.Arrays;
import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {
            int n = sc.nextInt();
            if ((n / 2) % 2 != 0) {
                System.out.println("NO");
            } else {
                int[] arr = new int[n];
                int k = 2;
                int p = 1;
                int fsum = 0;
                int lsum = 0;

                for (int j = 0; j < n / 2; j++) {
                    arr[j] = k;
                    fsum += k;
                    k += 2;
                }
                for (int l = n / 2; l < n - 1; l++) {
                    arr[l] = p;
                    lsum += p;
                    p += 2;
                }

                int pLsum=lsum;
                while(fsum!=lsum){
                    if(fsum<lsum+(p+2)){
                        break;
                    }
                    p+=2;
                    lsum+=p;
                }
                if(fsum == pLsum+p){
                    arr[n-1]=p;
                    System.out.println("YES");
                    for(int v=0;v<arr.length;v++){
                        System.out.printf("%d ",arr[v]);
                    }
                    System.out.println();
                }
                else{
                    System.out.println("NO");
                }
            }
            i++;
        }
        sc.close();
    }
}

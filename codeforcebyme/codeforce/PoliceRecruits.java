import java.util.Scanner;
public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int [] arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        int p=0;
        int c=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]>0){
                p=p+arr[k];
            }
            else if(p<=0){
                c++;
            }
            else{
                p--;
            }
        }
        System.out.println(c);
        sc.close();
    }
}

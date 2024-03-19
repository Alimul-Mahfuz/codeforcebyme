import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MediumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<t;i++){
            int j=0;
            int[] arr=new int[3];
            while(j<3){
                arr[j]=sc.nextInt();
                j++;
            }
            Arrays.sort(arr);
            list.add(arr[1]);

        }

        for(int i : list){
            System.out.println(i);
        }

    }
}

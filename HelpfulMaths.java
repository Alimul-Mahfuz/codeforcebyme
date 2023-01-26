import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sum;
        
        sum=sc.nextLine();
        // As '+' is a reserved charecter in regex that's why we nee '//+' for escaping.
        String[] newsum=sum.split("\\+");
        int[] arr=new int[newsum.length];
        for(int i=0;i<newsum.length;i++){
            arr[i]=Integer.parseInt(newsum[i]);
        }   

        Arrays.sort(arr);
        String newsg=" ";
        for(int i=0;i<arr.length;i++){
            newsg+=Integer.toString(arr[i]);
            if(i<arr.length-1){
                newsg+="+";
            }
        }
        System.out.println(newsg.trim());
        sc.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class LettersRearranging {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int i=0;
        while (i<t) {
            String input=sc.nextLine();
            if(input.equals(LettersRearranging.reverseString(input)) && isSameChar(input)){
                System.out.println(-1);
            }
            else{
                System.out.println(LettersRearranging.reArrange(input));
            }
            i++;
        }
        sc.close();
    }

    public static String reverseString(String param){
        char[] arr=param.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        return String.valueOf(arr);
    }

    public static boolean isSameChar(String param){
        char[] arr=param.toCharArray();
        char fc=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=fc){
                return false;
            }
        }
        return true;
    }

    public static String reArrange(String param){
        char[] arr=param.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}

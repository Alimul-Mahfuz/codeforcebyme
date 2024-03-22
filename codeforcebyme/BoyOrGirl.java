import java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sg=sc.nextLine();
        int count=0;
        char [] arr=sg.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                for(int k=i+1;k<arr.length;k++){
                    if(arr[i]==arr[k]){
                        arr[k]=' ';
                    }
                }
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}

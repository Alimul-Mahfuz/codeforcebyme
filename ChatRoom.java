import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sg=sc.nextLine();
        char[] arr=sg.toCharArray();
        char [] word={'h','e','l','l','o'};
        int count=0;
        int last=0;
        for(int i=0;i<word.length;i++){
            for(int j=last;j<arr.length;j++){
                if(word[i]==arr[j]){
                    count++;
                    last=j+1;
                    break;
                }
            }
        }
        if(count==5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
        
    }
}

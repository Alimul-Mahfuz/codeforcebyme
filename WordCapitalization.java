import java.util.Scanner;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sg=sc.nextLine();
        sg=sg.trim();
        char [] arr=sg.toCharArray();
        int ch=sg.charAt(0);
        if(ch>=97 && ch<=122){
            arr[0]=(char)(ch-32);
        }
        String newsg=" ";
        for(int i=0;i<arr.length;i++){
            newsg+=arr[i];
        }
        System.out.println(newsg.trim());
        sc.close();


    }
}

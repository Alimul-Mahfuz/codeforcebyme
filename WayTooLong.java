import java.util.ArrayList;
import java.util.Scanner;
public class WayTooLong {
    public static void main(String[] args) {
        int n;
        ArrayList<String> list= new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            String word=sc.nextLine();
            String neword;
            if(word.length()>10){
                neword=word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1);
                list.add(neword);
            }
            else{
                list.add(word);
            }
        }
        sc.close();
        for(String i:list){
            System.out.println(i);
        }
    }
}

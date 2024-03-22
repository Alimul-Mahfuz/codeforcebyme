import java.util.Scanner;
public class StoneOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n=Integer.parseInt(sc.nextLine());
        String sg=sc.nextLine();
        sg=sg.substring(0, n);
        for(int i=0;i<sg.length()-1;i++){
            if(sg.charAt(i)==sg.charAt(i+1)){
                count++;
                continue;
            }
            else{
                continue;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            String sg=sc.nextLine();
            int f=(int) sg.charAt(0)+ (int) sg.charAt(1)+ (int) sg.charAt(2);
            int l=(int) sg.charAt(3)+ (int) sg.charAt(4)+ (int) sg.charAt(5);
            if(f==l){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

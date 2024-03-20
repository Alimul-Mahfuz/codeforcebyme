import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String sg;
        for(int i=0;i<n;i++){
            sg=sc.nextLine(); 
            if(sg.length()%2==0){
                String s1=sg.substring(0, sg.length()/2);
                String s2=sg.substring(sg.length()/2,sg.length());
                if(s1.equals(s2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
        
    }
}

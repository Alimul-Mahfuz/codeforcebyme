import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String sg=sc.nextLine();
        int an=0;
        int dn=0;
        for(int i=0;i<n;i++){
            if(sg.charAt(i)=='A'){
                an++;
            }
            else if(sg.charAt(i)=='D'){
                dn++;
            }
        }
        if(an>dn){
            System.out.println("Anton");
        }
        else if(dn>an){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        sc.close();

    }
}

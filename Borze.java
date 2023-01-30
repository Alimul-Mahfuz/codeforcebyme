import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sg=sc.nextLine();
        char [] carr=sg.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<carr.length;i++){
            if(carr[i]=='.'){
                sb.append('0');
            }
            else if(carr[i]=='-'&&carr[i+1]=='.'){
                sb.append('1');
                i=i+1;
            }
            else if(carr[i]=='-'&&carr[i+1]=='-'){
                sb.append('2');
                i=i+1;
            }
        }
        System.out.println(sb);
        sc.close();


    }
}

import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int data=n/5;
        int md=n%5;
        int dff;
        for(int i=4;i>=1;i--){
            if(md==i){
                dff=md/i;
                data=data+dff;
            }
        }
        System.out.println(data);
        sc.close();
    }   
}

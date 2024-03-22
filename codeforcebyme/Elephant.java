import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // int data=n/5;
        // int md=n%5;
        // int dff;
        // for(int i=4;i>=1;i--){
        //     if(md==i){
        //         dff=md/i;
        //         data=data+dff;
        //     }
        // }
        int data=0;
        for(int i=5;i>0;i--){
            data=data+n/i;
            n=n%i;
        }
        System.out.println(data);
        sc.close();
    }   
}

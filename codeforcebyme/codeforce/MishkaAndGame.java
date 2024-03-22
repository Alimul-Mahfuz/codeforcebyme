import java.util.Scanner;
public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int round=sc.nextInt();
        int mishka=0;
        int chris=0;
        for(int i=0;i<round;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                mishka++;
            }
            else if(a<b){
                chris++;
            }
            else{
                mishka++;
                chris++;
            }
        }
        if(mishka>chris){
            System.out.println("Mishka");
        }
        else if(mishka<chris){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
        sc.close();

    }
}

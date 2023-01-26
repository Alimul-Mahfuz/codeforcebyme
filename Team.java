import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ispos=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<3;j++){
                int data=sc.nextInt();
                if(data==1){
                    count++;
                }
            }
            if(count>=2){
                ispos++;
            }
        }
        System.out.println(ispos);
        sc.close();
    }
}

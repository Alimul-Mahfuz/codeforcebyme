import java.util.Scanner;
public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int room=0,cnt,cap;
        for(int i=0;i<n;i++){
            cnt=sc.nextInt();
            cap=sc.nextInt();
            if((cap-cnt)>=2){
                room++;
            }
        }
        System.out.println(room);
        sc.close();

    }
}

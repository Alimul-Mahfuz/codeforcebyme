import java.util.Arrays;
import java.util.Scanner;
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String guest=sc.nextLine();
        String host=sc.nextLine();
        String pile=sc.nextLine();
        char[] pileName=pile.toCharArray();
        char[] guestName=guest.toCharArray();
        char[] hostName=host.toCharArray();
        int guestHostLenght=guestName.length+hostName.length;
        char[] combined=new char[guestHostLenght];
        System.arraycopy(guestName, 0, combined, 0, guestName.length);
        System.arraycopy(hostName, 0, combined, guestName.length, hostName.length);
        Arrays.sort(combined);
        Arrays.sort(pileName);
        if(Arrays.equals(combined, pileName)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();

    }
}

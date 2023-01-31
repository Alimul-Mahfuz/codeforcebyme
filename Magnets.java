import java.util.ArrayList;
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> list = new ArrayList<>();
        int grp = 1;
        String sg;
        for (int i = 0; i < n; i++) {
            sg = sc.nextLine();
            list.add(sg);

        }
        int i=0;
        for(i=0;i<list.size()-1;i++){
            if(list.get(i).equals(list.get(i+1))){
                continue;
                
            }
            else{
                grp++;
            }
        }
        System.out.println(grp);
        sc.close();

    }
}

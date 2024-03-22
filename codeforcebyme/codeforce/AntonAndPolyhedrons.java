import java.util.HashMap;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String [] sg=new String[n];
        for(int i=0;i<n;i++){
            sg[i]=sc.nextLine();
        }
        HashMap<String, Integer> polygon = new HashMap<String,Integer>();
        polygon.put("Tetrahedron",4);
        polygon.put("Cube",6);
        polygon.put("Octahedron",8);
        polygon.put("Dodecahedron",12);
        polygon.put("Icosahedron",20);
        int count=0;
        for(int i=0;i<n;i++){
            count=count+polygon.get(sg[i]);
        }
        System.out.println(count);
        sc.close();
    }
}

import java.util.Scanner;
public class Games{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int t=sc.nextInt();
        int [] arrH=new int[t];
        int [] arrA=new int[t];
        for(int i=0;i<t;i++){
            arrH[i]=sc.nextInt();      
            arrA[i]=sc.nextInt();      
        }
        for(int i=0;i<arrH.length;i++){
            for(int j=0;j<arrA.length;j++){
                if(arrH[i]==arrA[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
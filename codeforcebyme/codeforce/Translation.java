import java.util.Scanner;
public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        char[] s3=s1.toCharArray();
        for(int i=0,j=s3.length-1;i<(s3.length)/2;i++,j--){
            char temp=s3[i];
            s3[i]=s3[j];
            s3[j]=temp;

        }
        String st=new String(s3);
        if(s2.equals(st)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();

    }
}

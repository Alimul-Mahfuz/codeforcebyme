import java.util.Scanner;
public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String sg;
        if(n==1){
            sg="I hate it";
        }
        else if(n==2){
            sg="I hate that I love it";
        }
        else{
            sg="I hate that I love it";
            for(int i=2;i<n;i++){
                sg=sg.replace("it", "that ");
                if(i%2==0){
                    sg=sg+"I hate it";
                }
                else{
                    sg=sg+"I love it";
                }
            }
        }
        System.out.println(sg);
        sc.close();

    }
}

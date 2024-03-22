import java.util.Scanner;
public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,t;
        n=sc.nextInt();
        t=sc.nextInt();
        sc.nextLine();
        String sg= sc.nextLine();
        char [] arr=sg.toCharArray();
        
        while(t>0){
            for(int i=0;i<n-1;i++){
                if(arr[i]=='B'&&arr[i+1]=='G'){
                    char temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    i++;
                }
            }
            t--;
        }
        for(char i :arr){
            System.out.printf("%c",i);
        }
        sc.close();

    }
}

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String sg=sc.nextLine();
       sg=sg.trim();
       int caps=0;
       int sm=0;
       char [] arr=sg.toCharArray();
       for(int i=0;i<arr.length;i++){
            if(arr[i]>=65&&arr[i]<=90){
                caps++;
            }
            else{
                sm++;
            }
       } 
       if(caps>sm){
        sg=sg.toUpperCase();
       }
       else{
        sg=sg.toLowerCase();
       }
       System.out.println(sg);
       sc.close();
    }
}

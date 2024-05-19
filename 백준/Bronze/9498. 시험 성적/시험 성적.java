import java.util.Scanner;
public class Main{
    public static void main(String[]args){
      Scanner a= new Scanner(System.in);
      int number=a.nextInt();
        
       if (90<=number){
           System.out.println('A');
       }
       else if (80<=number){
            System.out.println('B');
       }
        else if (70<=number){
            System.out.println('C');
       }
        else if (60<=number){
            System.out.println('D');
       }
       else
           System.out.println('F');
       
        
    }
}
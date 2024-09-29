import java.util.Scanner;

public class Solution{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
String str = s.next();
StringBuilder newstr = new StringBuilder();

for (int i =0; i < str.length(); i++){
char c = str.charAt(i);

if (Character.isUpperCase(c)){
c = Character.toLowerCase(c);
 
}else
c = Character.toUpperCase(c);
    newstr.append(c);
}
    System.out.print(newstr);
     s.close();
}


}

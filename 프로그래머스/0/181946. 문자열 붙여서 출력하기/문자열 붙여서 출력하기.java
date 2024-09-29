import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        StringBuilder result = new StringBuilder();
            
        for (int i = 0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            if (c1 != ' '){
                result.append(c1);
            }
        }
            System.out.println(result);
        }
    }

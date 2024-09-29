class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        StringBuilder answer = new StringBuilder();
        for (int j = 0; j < s; j++){
            char c = my_string.charAt(j);
            answer.append(c);
        }
        for (int i = 0; i < overwrite_string.length(); i++){
            char c1 = overwrite_string.charAt(i);
            answer.append(c1);
        }
        for (int z = s + overwrite_string.length(); z < my_string.length(); z++){
            char c2 = my_string.charAt(z);
            answer.append(c2);
        }
        return answer.toString();
    
}
}
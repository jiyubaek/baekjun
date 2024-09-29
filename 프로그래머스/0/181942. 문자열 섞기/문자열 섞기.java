class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        
        for (int i =0; i < str1.length(); i++){
        char s1 = str1.charAt(i);
        char s2 = str2.charAt(i);
        answer.append(s1);
        answer.append(s2);
        
    }
        return answer.toString();
}
}
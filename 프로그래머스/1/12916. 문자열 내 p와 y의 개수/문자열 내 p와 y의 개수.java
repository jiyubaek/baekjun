class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        char[] array = s.toCharArray();
        int pn = 0;
        int yn = 0;
        
        for (char c : array){
if(c == 'p'){
    pn += 1;
}else if(c == 'y'){
    yn += 1;
}}
        if (pn != yn){
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
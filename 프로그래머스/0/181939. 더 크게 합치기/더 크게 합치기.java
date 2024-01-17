class Solution {
    public int solution(int a, int b) {
        
        //정수 -> 문자열
        //Integer.toString();
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        String addStringA = strA + strB;
        String addStringB = strB + strA;

        //문자열 -> 정수
        //Integer.parseInt();
        int transToIntA = Integer.parseInt(addStringA);
        int transToIntB = Integer.parseInt(addStringB);
        
        int answer = 0;
        
        if(transToIntA > transToIntB){
            answer = transToIntA;
        }else{
            answer = transToIntB;
        }
        
        return answer;
    }
}
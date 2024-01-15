import java.lang.StringBuilder; 

class Solution {
    public String solution(String[] arr) {

        StringBuilder strBuilder = new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            strBuilder.append(arr[i] +"");
        }
        
        String answer = strBuilder.toString();
        System.out.println(answer);
        
        return answer;
    }
}
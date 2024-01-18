class Solution {
    public int solution(int a, int b) {
        
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        String addString = strA+strB;
        System.out.println("addString: "+addString);
        int addStringNum = Integer.parseInt(addString);
        System.out.println("addStringNum: "+addStringNum);
        int multiNum = 2*a*b;
        System.out.println("multiNum: "+multiNum);
        
        int answer = 0;
        
        if(addStringNum < multiNum){
            answer = multiNum;
        }else if(addStringNum == multiNum){
            answer = addStringNum;
        }else if(addStringNum > multiNum){
            answer = addStringNum;
        }
            
        return answer;
    }
}
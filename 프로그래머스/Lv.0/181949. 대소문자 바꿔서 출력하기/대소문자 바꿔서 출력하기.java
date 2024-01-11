import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char index_a = ' ';
        int trans_a = 0;
        String[] a_ary = new String[a.length()];        
        
        for(int i=0; i<a.length(); i++){
            index_a = a.charAt(i);
            if((int)index_a >= 97){
                trans_a = (int)index_a - 32;
                // System.out.println(trans_a);
                // System.out.println((char)trans_a);
                String trans_str_a = String.valueOf((char)trans_a);
                a_ary[i] = trans_str_a;
            }else if((int)index_a <= 97){
                trans_a = (int)index_a + 32;
                // System.out.println(trans_a);
                // System.out.println((char)trans_a);
                String trans_str_a = String.valueOf((char)trans_a);
                a_ary[i] = trans_str_a;
            }
        }
        // System.out.println(Arrays.toString(a_ary));
        
        String result_a = String.join("",a_ary);
        System.out.println(result_a);

    }
}
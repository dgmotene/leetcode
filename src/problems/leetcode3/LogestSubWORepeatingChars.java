package problems.leetcode3;

import java.util.HashMap;

public class LogestSubWORepeatingChars {

    public static void main(String[] args) {
        String s = "abcabbc";

        int result = solution(s);
        System.out.println(result);
    }
    public static int solution(String s){
        
        int result = 0, left = 0, n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int j = 0; j < n; j++){
            if(map.containsKey(s.charAt(j))){
                left = Math.max(map.get(s.charAt(j)), left);
            }
            result = Math.max(result, j - left + 1);
            map.put(s.charAt(j), j + 1);
        }
        
        return  result;
    }
}



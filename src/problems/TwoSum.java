package problems;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        //example
        int[] nums = {1,2,3,4,6,7,8};
        int target = 10;

        int[] result = solution(nums, target);
        System.out.printf("[%d,%d]", result[0],result[1]);
    }

    public static int[] solution(int[] nums, int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return  new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return nums;
    }
}

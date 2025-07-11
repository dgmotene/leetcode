package problems;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        //example
        int[] nums = {1,2,3,4,6,7,8};
        int target = 10;

        int[] result = solution(nums, target);
        System.out.printf("[%d,%d]", result[0],result[1]);
    }
    public static int[] solution(int[] nums, int target){
        for (int i = 0; i < nums.length;i++){
            for(int j = i +1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }

        return nums;
    }
}

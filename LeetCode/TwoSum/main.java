package LeetCode.TwoSum;

/*
 * Question 1: Two Sum
 * int[] nums = { 2, 7, 11, 15 }; int target = 26;
 * suppose array is given now tell the sum of 9 from the array
 * Example from the given array 
 * index 0 which is 2 and the index 1 which is 7 
 * so 2+7 = 9 which is the target
 * 
 * 
 * 
 */

public class main {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // main logic

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        main obj = new main();

        // *Default value given by the leet code
        int[] nums = { 2, 7, 11, 15 };
        int target = 26;
        int[] result = obj.twoSum(nums, target);

        for (int element : result) {
            System.out.println("index :" + element);
        }
    }
}

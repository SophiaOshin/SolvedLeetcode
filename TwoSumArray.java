/* 1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/
public class TwoSumArray {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
         int target = 6;       
        twoSum(nums,target);
     }   
    static int[] twoSum(int[] nums, int target) {
           int x = 0;
           int curr = 0;
           int map = 0;
           int [] answer = new int[2];
           for (int i = 0; i <= nums.length - 1; i++) {
               curr = nums[i];
               x = target - curr;
               for (int j = i + 1; j <= nums.length - 1; j++) {
                   map = nums[j];
                   if (x == map) {
                       answer[0]=i;
                       answer[1] = j;
                   } else
                       j++;
               }
           }
            return answer;
        }  
   }
   
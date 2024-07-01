/*  1920. Build Array from Permutation
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where 
ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
*/

public class PermutationArray {
    public static void main(String[] args) {
       int [] nums = {5,0,1,2,3,4};   
       int [] answer= buildArray(nums);
        for (int i = 0; i <= answer.length-1; i++) {
        System.out.print(answer[i]);
        }
     }
        static int[] buildArray(int[] nums) {
      int [] ans = new int[6];
           for (int i=0; i<=nums.length-1;i++){   
           ans[i]= nums[nums[i]];
           } 
           return ans;
        
        }
    }
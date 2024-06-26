/*  1929. Concatenation of Array
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
*/
public class ConcatenationofArray {
    public static void main(String[] args) {
       int [] nums = {1,3,2,1};   
       int [] answer= getConcatenation(nums);
        for (int i = 0; i <= answer.length-1; i++) {
        System.out.print(answer[i]);
        }
     } 
    static int[] getConcatenation(int[] nums) {
           int n = nums.length;
            int [] ans = new int[n*2];
        for (int i = 0; i <= n-1; i++) {
            ans[i] = nums[i];
            for (int j = i + n; j < n * 2; j++) {
                ans[j] = nums[i];
            }
        }
        return ans;
    }   
    }

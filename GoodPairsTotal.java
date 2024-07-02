/*1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * 
 */
public class GoodPairsTotal {
    public static void main(String[] args) {
        int [] nums = {1,2,34,3,4,5,7,23,12};  
        numIdenticalPairs(nums);
     } 
    static int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i=0; i<=nums.length-1; i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i] == nums[j] ){
                        count++;
                }
            }
        }
        return count;
    }
}

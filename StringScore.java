/*3110. Score of a String
You are given a string s. The score of a string is defined as the sum of the absolute 
difference between the ASCII values of adjacent characters.
Return the score of s.

Input: s = "hello"
Output: 13
 */ 

 public class StringScore {
    public static void main(String[] args) {
        String s = "zaz" ;   
        scoreOfString(s);
     }  
        static int scoreOfString(String s) {
            int len = s.length();
             System.out.println(len);
            int sum = 0;
            int val=0;
            for(int i =0;i<= len -2; i++){
                val= s.charAt(i)-s.charAt(i+1);
                sum += Math.abs(val);
            }  
            return sum; 
        }
    }
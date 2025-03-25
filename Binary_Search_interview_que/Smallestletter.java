package Binary_Search_interview_que;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallestletter {
    public static void main(String[] args) {
        
    }
    public char nextGreatestLetter(char[] letters, char target) {
        // but what if target is greatest number in the array
        int s = 0;
        int e = letters.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target < letters[mid]) {
                e = mid - 1;
            } else{
                s = mid + 1;
            }
        }
        return letters[s % letters.length];
    }
}
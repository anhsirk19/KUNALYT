package SDE;

public class missing_rep {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,3};
        mat(arr);
    }
    //we also do this sum by hashing
    static void mat(int[] nums){
        int n = nums.length;
        int sum = 0;
        int sum2 = 0;
        int sumn = n*(n+1)/2;
        int sumn2 = n*(n+1)*((2*n)+1)/2;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            sum2 += Math.pow(nums[i], 2);
        }
        int d1 = sum - sumn;
        int d2 = sum2 - sumn2;
        int x = (d2/2*d1) - (d1/2);
        int y = x - d1;
        System.out.println(x);
        System.out.println(y);
    }
}

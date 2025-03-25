package Arrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums1[i];
                k++;
                i++;
            }else if(nums1[i] == nums2[j]){
                nums1[k] = nums1[i];
                k++;
                nums1[k] = nums1[i];
                i++;
                j++;
                k++;
            }else{
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(j < n){
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }
    
}

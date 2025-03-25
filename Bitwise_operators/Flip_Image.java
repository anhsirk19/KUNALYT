package Bitwise_operators;

//https://leetcode.com/problems/flipping-an-image/description/

public class Flip_Image {
    public static void main(String[] args) {
        
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            //reverse this array
            for(int i = 0 ; i < (row.length + 1) / 2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i -1] ^ 1;
                row[row.length - i -1] = temp;
            }
        }
        return image;
    }
}

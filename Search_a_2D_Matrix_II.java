/**
 * Created by MH on 8/3/2017.
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted in ascending from left to right.
 Integers in each column are sorted in ascending from top to bottom.
 For example,

 Consider the following matrix:

 [
 [1,   4,  7, 11, 15],
 [2,   5,  8, 12, 19],
 [3,   6,  9, 16, 22],
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]
 ]
 Given target = 5, return true.

 Given target = 20, return false.
 */
public class Search_a_2D_Matrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for(int i = 0; i < matrix.length; i++){
            if(checkBothSide(matrix[i], target)){
                result = find(matrix[i], target);
            }
            if(result){
                break;
            }
        }
        return result;
    }

    private boolean checkBothSide(int[] col, int target){
        if(col.length < 1){
            return false;
        }
        if(col[0] <= target && col[col.length-1] >= target) {
            return true;
        }
        return false;
    }

    private boolean find(int[] colu, int target){
        if(colu.length < 1){
            return false;
        }
        for(int i = 0; i < colu.length; i++){
            if(colu[i] == target){
                return true;
            }
        }
        return false;
    }
}

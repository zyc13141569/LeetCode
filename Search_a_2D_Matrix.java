/**
 * Created by MH on 8/3/2017.
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]

 Given target = 3, return true.
 */
public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(check(matrix)==false) return false;
        int mark = 0, length = matrix[0].length -1 ;

        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] <= target) {
                if(matrix[i][matrix[i].length-1] >= target){
                    if(matrix[i][0] == target && matrix[i][length] == target) return true;
                    mark = i;
                    break;
                }
            }
        }
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[mark][i] == target) return true;
        }
        return false;
    }

    public boolean check(int[][] matrix){
        if(matrix.length == 0) return false;
        if(matrix[0].length == 0) return false;
        return true;
    }
}

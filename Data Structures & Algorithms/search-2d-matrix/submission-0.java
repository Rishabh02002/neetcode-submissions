class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Quick edge case check for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int row;
        int mid;

        
        if (target > matrix[matrix.length - 1][right] || target < matrix[0][0]) {
            return false;
        }

       
        for (row = 0; row < matrix.length; row++) {
            
            if (target >= matrix[row][left] && target <= matrix[row][right]) {
                break;
            }
        }

       
        if (row == matrix.length) {
            return false;
        }

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (matrix[row][mid] == target) {
                return true;
            }

            else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}

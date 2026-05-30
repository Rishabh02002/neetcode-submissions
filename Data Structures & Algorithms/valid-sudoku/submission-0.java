class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rowSet.contains(board[i][j])) {
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }
        for (int i = 0; i < board[1].length; i++) {
            Set<Character> colSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (colSet.contains(board[j][i])) {
                    return false;
                }
                colSet.add(board[j][i]);
            }
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> squareCount = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;
                    if (board[row][col] =='.') {
                        continue;
                    }
                    if (squareCount.contains(board[row][col])) {
                        return false;
                    }
                    squareCount.add(board[row][col]);
                }
            }
        }
        return true;
    }
}

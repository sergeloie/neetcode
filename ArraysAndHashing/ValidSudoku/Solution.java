//https://leetcode.com/problems/valid-sudoku/description/

/*
36. Valid Sudoku

        Medium

        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

        Each row must contain the digits 1-9 without repetition.
        Each column must contain the digits 1-9 without repetition.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

        Note:

        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        Only the filled cells need to be validated according to the mentioned rules.
*/

//https://leetcode.com/problems/valid-sudoku/submissions/1261514355/

package ArraysAndHashing.ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {

        return checkAllSubMatrixes(board) && checkLines(board);
    }

    public boolean checkSubMatrix(char[][] matrix, int rowIndex, int columnIndex) {
        Set<Character> set = new HashSet<>();

        for (int i = rowIndex; i <= rowIndex + 2; i++) {
            for (int j = columnIndex; j <= columnIndex + 2; j++) {
                char current = matrix[i][j];
                if (current != '.') {
                    if (!set.add(current)) {
                        return false;
                    }
               }
        }

    }
        return true;
    }


    public boolean checkAllSubMatrixes(char[][] matrix) {
        for (int i = 0; i <= 6; i = i + 3) {
            for (int j = 0; j <= 6; j = j + 3) {
                if (!checkSubMatrix(matrix, i, j)) {
                    return false;}
            }
        }
        return true;
    }

    public boolean checkLines(char[][] matrix) {
        Set<Character> setRow = new HashSet<>();
        Set<Character> setColumn = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            setRow.clear();
            setColumn.clear();
            for (int j = 0; j < 9; j++) {
                char rowChar = matrix[i][j];
                char colChar = matrix[j][i];
                if (rowChar != '.') {
                    if (!setRow.add(rowChar)) {
                        return false;
                    }
                }
                if (colChar != '.') {
                    if (!setColumn.add(colChar)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

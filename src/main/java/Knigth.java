import java.util.ArrayList;
import java.util.List;

public class Knigth {
    public static void main(String[] args) {
        Knigth k = new Knigth();
        k.solveKnigth(8);
    }

    int[][] board;
    int count;
    int size = 8;
    int[][] steps = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
    List<List<String>> ans = new ArrayList();

    public List<List<String>> solveKnigth(int size) {
        board = new int[size][size];
        backtrack(0, 0, 0);
        return ans;

    }

    private void backtrack(int col, int row, int count) {
        if (count == size * size) {
            addBoard();

            return;
        }
        for (int[] move : steps) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            int newStep = count + 1;
            if (canPlace(newRow, newCol, board)) {
                board[newRow][newCol] = newStep;
                count++;
                backtrack(newCol, newRow, newStep);
                board[newRow][newCol] = 0;
            }

        }
    }

    private boolean canPlace(int row, int col, int[][] board) {
        if (row >= size || row < 0) return false;
        if (col >= size || col < 0) return false;
        if (board[row][col] != 0) return false;
        return true;
    }

    private void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[i][j] == count);
            }
            b.add(sb.toString());
        }
        ans.add(b);
    }
}



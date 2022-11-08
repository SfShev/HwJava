import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Knigth {
    public static void main(String[] args) {
        Knigth k = new Knigth();
        k.solveKnigth(4);
    }

    int[][] board;
    int count;
    int size = 4;
    int[][] steps = {{1,2},{-1,2},{1,-2},{-1,-2},{2,1},{-2,1},{2,-1},{-2,-1}};
    List<List<String>> ans = new ArrayList();

    public List<List<String>> solveKnigth(int size) {
        board = new int[size][size];
        board[0][0] = 1;
        backtrack(0, 0, 1);

        return ans;

    }

    private void backtrack(int row, int col, int count) {

        if (count == size * size) {
            addBoard();
            print();

            return;
        }
        for (int[] move : steps) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            int newStep = count + 1;
            if (canPlace(newRow, newCol)) {
                count++;
                board[newRow][newCol] = newStep;
                backtrack(newRow, newCol, newStep);
                board[newRow][newCol] = 0;

            }

        }
    }

    private boolean canPlace(int row, int col) {
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

    public void print() {
        for (int[] item : board) {
            System.out.println(Arrays.toString(item));

        }
        System.out.println();
    }

}



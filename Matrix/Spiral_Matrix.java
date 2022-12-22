package Matrix;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length - 1;
        if (row < 0)
            return Collections.EMPTY_LIST;
        int col = matrix[0].length - 1;
        List<Integer> l = new ArrayList<Integer>(row + 1 * col + 1);
        int r = 0, c = 0;
        while (r <= row && c <= col) {

            for (int i = c; i <= col; i++) {
                l.add(matrix[r][i]);
            }
            r++;

            for (int i = r; i <= row; i++) {
                l.add(matrix[i][col]);
            }
            col--;

            if (r <= row && c <= col) {

                for (int i = col; i >= c; i--) {
                    l.add(matrix[row][i]);
                }
                row--;

                for (int i = row; i >= r; i--) {
                    l.add(matrix[i][c]);
                }
                c++;
            }
        }
        return l;
    }
}

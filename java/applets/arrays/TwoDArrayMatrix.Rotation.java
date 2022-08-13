
/**
 * Java program to rotate a matrix of int numbers.
 * 
 * Input
 * 
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 
 * Output
 * 
 * 5  1  2  3
 * 9  10 6  4
 * 13 11 7  8
 * 14 15 16 12
 * 
 */

class TwoDArrayMatrixRotation {
	
	static final int R = 4;
	static final int C = 4;

	/**
	 * A function to rotate a matrix
	 * @param rows = initially = R
	 * @param cols = initially = C
	 * @param mat mat[][] of size R x C.
	 */
	static void rotateMatrix(int rows,
			int cols, int mat[][]) {
		int row = 0, col = 0;
		int prev, curr;

		/*
		 * row - Starting row index
		 * m - ending row index
		 * col - starting column index
		 * n - ending column index
		 * i - iterator
		 */
		while (row < rows && col < cols) {

			if (row + 1 == rows || col + 1 == cols)
				break;

			/* Store the first element of next
			 * row, this element will replace
			 * first element of current row
			 */
			prev = mat[row + 1][col];

			/* Move elements of first row
			 * from the remaining rows
			 */
			for (int i = col; i < cols; i++) {
				curr = mat[row][i];
				mat[row][i] = prev;
				prev = curr;
			}
			row++;

			/* Move elements of last column
			 * from the remaining columns
			 */
			for (int i = row; i < rows; i++) {
				curr = mat[i][cols - 1];
				mat[i][cols - 1] = prev;
				prev = curr;
			}
			cols--;

			/* Move elements of last row
			 * from the remaining rows
			 */
			if (row < rows) {
				for (int i = cols - 1; i >= col; i--) {
					curr = mat[rows - 1][i];
					mat[rows - 1][i] = prev;
					prev = curr;
				}
			}
			rows--;

			/*  Move elements of first column
			 * from the remaining rows
			 */
			if (col < cols) {
				for (int i = rows - 1; i >= row; i--) {
					curr = mat[i][col];
					mat[i][col] = prev;
					prev = curr;
				}
			}
			col++;
		}

		/*  Print rotated matrix
		 */
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++)
				System.out.print(mat[i][j] + " ");
			System.out.print("\n");
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		/*  Test Case 1 */
		int a[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };

		/*  Test Case 2 */
		/*
		 * int a[][] = new int {{1, 2, 3},
		 * {4, 5, 6},
		 * {7, 8, 9}
		 * };
		 */
		rotateMatrix(R, C, a);

	}
}

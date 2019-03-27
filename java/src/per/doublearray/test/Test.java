package per.doublearray.test;

public class Test {
	static public void main(String[] args) {
		int[][] matrix = new int[][] {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9,10,11,12}
		};
		int[] result = findDiagonalOrder(matrix);
		for(int i:result) {
			
			System.out.print(i+" ");
		}
		}

	private static int[] findDiagonalOrder(int[][] matrix) {
		if(matrix==null||matrix.length==0) {
			return new int[] {};
		}
		int r=0,c=0;
		int row=matrix.length,col=matrix[0].length;
		int[] result = new int[row*col];
		for(int i=0;i<result.length;i++) {
			result[i]=matrix[r][c];
			if((r+c)%2==0) {
				if(c==col-1) {
					r++;
				}else if(r==0) {
					c++;
				}else {
					r--;
					c++;
				}
			}else {
				if(r==row-1) {
					c++;
				}else if(c==0) {
					r++;
				}else {
					r++;
					c--;
				}
			}
		}
		return result;
	}
		
}

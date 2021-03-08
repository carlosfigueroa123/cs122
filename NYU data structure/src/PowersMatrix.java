
public class PowersMatrix {

	public static void main(String[] args) {
        int [][] matrix = {{0,-1},{1,1}};
        int k = 5;
        int [][] matrixpower = power1(matrix, k);
        
        
        System.out.println("Input array: ");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("column: '" + j + "'row: '" + i + "' =" +matrix[i][j]);
            }
        }
        
        System.out.println(" ");
        
        System.out.println("Output array: ");
        
        for (int i = 0; i < matrixpower.length; i++) {
            for (int j = 0; j < matrixpower[i].length; j++) {
                System.out.println("column: '" + j + "'row: '" + i + "' =" + matrixpower[i][j]);
            }
        }
        
        
    }

  public static int [][] power1(int[][] matrix, int k)
  {
	  int r1, c1, c2;
	  r1 = matrix.length;
	  c1 = matrix[0].length;
	  c2 = c1;//since it is the same array, then the columns are the same
  	
  	if(k == 0) {
  		return getIdentity(r1);
  	}
  	
  	int[][] result = power1(matrix, k/2);
  	
  	if(k % 2 == 0) {
  		return multiplyMatrices(result, result, r1,c1,c2);
  	}
  	else 
  		return multiplyMatrices(multiplyMatrices(result, result, r1,c1,c2), matrix,r1,c1,c2);
  }
  
    
    public static int [][] getIdentity(int size) {
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++) {
        	matrix[i][i] = 1;
        }
        return matrix;
      }
    
    
    public static int[][] multiplyMatrices(int[][] matrix, int[][] matrixoriginal, int r1, int c1, int c2) {//n^3 efficiency aprox.
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += matrix[i][k] * matrixoriginal[k][j];
                }
            }
        }
        return product;
    }
}

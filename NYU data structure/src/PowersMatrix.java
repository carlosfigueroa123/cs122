
public class PowersMatrix {

	public static void main(String[] args) {
        int [][] matrix = {{0,-1},{1,1}};
        int k = 7;
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

    
//    static int[][] powerMatrix (int[][] a, int p) {
//        int[][] result = a;
//        if(p == 0) {
//        	return getIdentity(2);
//        }
//        
//        for (int n = 1; n < p; n++)
//            result = multiplyMatrices(result,a,2,2,2);
//        return result;
//    }
    
//    public static int[][] power(int[][] a, int powerRaised) {//inneficient case
//    	int[][] result1 = a;
//    	
//        if (powerRaised != 0) {
//            return multiplyMatrices(power(result1, powerRaised - 1),a, 2,2,2);
//        }
//        else
//            return getIdentity(2);
//    }
    
  public static int [][] power1(int[][] matrix, int k)//most efficient form
  {
  	
  	if(k == 0) {
  		return getIdentity(2);
  	}
  	
  	int[][] result = power1(matrix, k/2);
  	
  	if(k % 2 == 0) {
  		return multiplyMatrices(result, result, 2,2,2);
  	}
  	else 
  		return multiplyMatrices(multiplyMatrices(result, result, 2,2,2), matrix,2,2,2);
  }
  
    
    public static int [][] getIdentity(int size) {
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++) matrix[i][i] = 1;
        return matrix;
      }
    
    
    public static int[][] multiplyMatrices(int[][] matrix, int[][] matrixoriginal, int r1, int c1, int c2) {
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

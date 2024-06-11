import matrix.Matrix;
import matrix.MatrixImpl;

/**
 * Driver class showing how to use the Matrix interface and MatrixImpl class.
 */
public class Main {

  /**
   * Main entry point of the program.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    // Create two matrices
    Matrix matrix1 = new MatrixImpl(2, 2);
    matrix1.setElement(0, 0, 1);
    matrix1.setElement(0, 1, 2);
    matrix1.setElement(1, 0, 3);
    matrix1.setElement(1, 1, 4);

    Matrix matrix2 = new MatrixImpl(2, 2);
    matrix2.setElement(0, 0, 5);
    matrix2.setElement(0, 1, 6);
    matrix2.setElement(1, 0, 7);
    matrix2.setElement(1, 1, 8);

    // Add the two matrices
    Matrix result = matrix1.add(matrix2);
    System.out.println("Matrix 1 + Matrix 2:");
    System.out.println(result);

    // Multiply the two matrices
    result = matrix1.multiply(matrix2);
    System.out.println("Matrix 1 * Matrix 2:");
    System.out.println(result);
  }
}

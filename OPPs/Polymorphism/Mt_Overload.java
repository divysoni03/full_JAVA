class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    //constructors
    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new int[rows][cols];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }
    
    //methods
    public Matrix add(Matrix other) {
        if(this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrix dimensions must match for addition.");
            return new Matrix(0, 0);
        }

        Matrix result = new Matrix(this.rows, this.cols);

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return result;
    }
    public Matrix add(int scalar) {
        Matrix result = new Matrix(this.rows, this.cols);

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result.data[i][j] = this.data[i][j] + scalar;
            }
        }
        return result;
    }
    public Matrix subtraction(Matrix other) {
        if(this.rows != other.rows || this.cols != other.cols) {
            System.out.println("ERROR : For subtraction both matrix's rows and cols must be same.");
            return new Matrix(0,0); // returns null matrix with zero rows and cols
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for(int i=0;i<this.rows;i++) {
            for(int j=0;j<this.cols;j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j]; // having obj so we have to call .data
            }
        }
        return result;
    }
    public Matrix subtraction(int scaler) {
        Matrix result = new Matrix(this.rows,this.cols);
        for(int i=0;i<this.rows;i++) {
            for(int j=0;j<this.cols;j++) {
                result.data[i][j] = this.data[i][j] - scaler; // having obj so we have to call .data
            }
        }
        return result;
    }
    public Matrix multiplication(Matrix other) {
        if(this.rows != other.cols) {
            System.out.println("ERROR : for multiplication rows from matrix 1 and cols from matrix 2 must be same.");
            return new Matrix(0,0);
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for(int i=0;i<this.rows;i++) {
            for(int j=0;j<this.cols;j++) {
                result.data[i][j] = 0;
                for(int k=0;k<this.rows;k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][i];
                }
            }
        }
        return result;
    }
    public Matrix multiplication(int scaler) {
        Matrix result = new Matrix(this.rows, this.cols);

        for(int i=0;i<this.rows;i++) {
            for(int j=0;j<this.cols;j++) {
                result.data[i][j] = this.data[i][j] * scaler;
            }
        }
        return result;
    }
    public Matrix transpose() {
        Matrix result = new Matrix(this.rows, this.cols);
        for(int i=0;i<this.rows;i++) {
            for(int j=0;j<this.cols;j++) {
                result.data[i][j] = this.data[j][i];
            }
        }
        return result;
    }

    //display method
    public void display() {
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.printf("%02d ", data[i][j]);
            }
            System.out.println();
        }
    }
}

public class Mt_Overload {
    public static void main(String[] args) {
        int[][] matrix1Data = {{1, 2}, {3, 4}};
        int[][] matrix2Data = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(matrix1Data);
        Matrix matrix2 = new Matrix(matrix2Data);

        System.out.println("Matrix 1:");
        matrix1.display();
        System.out.println("\nMatrix 2:");
        matrix2.display();

        // --> addition
        // System.out.println("\nMatrix 1 + Matrix 2:");
        // matrix1.add(matrix2).display();
        // System.out.println("\nMatrix 1 + (Scalar)10:");
        // matrix1.add(10).display();

        // --> subtraction
        // System.out.println("\nMatrix1 - Matrix2 : ");
        // matrix1.subtraction(matrix2).display();
        // System.out.println("\nMatrix1 - scaler : ");
        // matrix1.subtraction(2).display();

        // --> multiplication
        // System.out.println("Matrix1 * Matrix2 :");
        // matrix1.multiplication(matrix2).display();
        // System.out.println("Matrix 1 * scaler : ");
        // matrix1.multiplication(10).display();

        // transpose of matrix
        // System.out.println("Transpose of matrix1 :");
        // matrix1.transpose().display();
        // System.out.println("Transpose of matrix2 :");
        // matrix2.transpose().display();
    }
}

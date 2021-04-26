package labor10_5;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.columns = data[this.rows-1].length;
        this.data = new double[this.rows][this.columns];
        for(int i = 0; i < this.rows; i++){
            System.arraycopy(data[i], 0, this.data[i], 0, this.columns);
        }
    }

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.data = new double[this.rows][this.columns];
    }

    public Matrix(Matrix matrix){
        this.rows = matrix.getRows();
        this.columns = matrix.getColumns();
        this.data = new double[this.rows][this.columns];
        for(int i = 0; i < this.rows; i++){
            if (this.columns >= 0) System.arraycopy(matrix.data[i], 0, this.data[i], 0, this.columns);
        }
    }

    public void fillRandom(double num1, double num2){
        Random rand = new Random();
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                this.data[i][j] = num1 + (num2 - num1) * rand.nextDouble();
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                System.out.printf("%10.2f ", this.data[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix matrix1, Matrix matrix2) throws MatrixException{
        Matrix Sum = new Matrix(matrix1);
        for(int i = 0; i < Sum.rows; i++){
            for(int j = 0; j < Sum.columns; j++){
                Sum.data[i][j] += matrix2.data[i][j];
            }
        }
        return Sum;

    }

    public Matrix multiply(Matrix matrix1, Matrix matrix2){
        Matrix multiply = new Matrix(matrix1.rows, matrix2.columns);
        for(int i = 0; i < multiply.rows; i++){
            for(int j = 0; j < multiply.columns; j++){
                multiply.data[i][j] = matrix1.data[i][j%(matrix1.columns-1)]*matrix2.data[i%(matrix2.rows-1)][j] + matrix1.data[i][(j+1)%(matrix1.columns-1)]*matrix2.data[(i+1)%(matrix2.rows-1)][j] + matrix1.data[i][(j+2)%(matrix1.columns-1)]*matrix2.data[(i+2)%(matrix2.rows-1)][j];
            }
        }
        return multiply;
    }

    public Matrix transpose(Matrix matrix1){
        Matrix transpose = new Matrix(matrix1.columns, matrix1.rows);
        for(int i = 0; i < transpose.rows; i++){
            for(int j =0; j < transpose.columns; j++){
                transpose.data[i][j] = matrix1.data[j][i];
            }
        }

        return transpose;
    }
}

package ru.mirea.task20.opt5;

public class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (matrix.length != other.matrix.length || matrix[0].length != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        T[][] result = (T[][]) new Number[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = add(matrix[i][j], other.matrix[i][j]);
            }
        }
        return new Matrix<>(result);
    }

    private T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported number type");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] row : matrix) {
            for (T element : row) {
                sb.append(element).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Integer[][] matrix1 = {{1, 2}, {3, 4}};
        Integer[][] matrix2 = {{5, 6}, {7, 8}};

        Matrix<Integer> m1 = new Matrix<>(matrix1);
        Matrix<Integer> m2 = new Matrix<>(matrix2);

        Matrix<Integer> result = m1.add(m2);
        System.out.println(result);
    }
}
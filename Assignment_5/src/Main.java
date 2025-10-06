import java.io.File;
import java.util.Scanner;


void main() {
    int[][] matrix = null;
    int matrixSize = 0;
    try {
        File file = new File("macierz.txt");
        Scanner scn = new Scanner(file);


        matrixSize = 3;
        matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

    } catch (FileNotFoundException e) {
        System.out.println("Nie znaleziono pliku.");
    }

    if (isMagicSquare(matrix, matrixSize)) {
        System.out.println("Macierz jest kwadratem magicznym.");
    } else {
        System.out.println("Macierz NIE jest kwadratem magicznym.");
    }

}

boolean isMagicSquare(int[][] matrix, int mSize){
    int sumd1 = 0;
    int sumd2 = 0;

    for (int i = 0; i < mSize; i++){
        sumd1 += matrix[i][i];
        sumd2 += matrix[i][mSize-1-i];
    }
    if (sumd1!=sumd2)
        return false;

    for (int i = 0; i  < mSize; i++){
        int rowSum = 0;
        int colSum = 0;

        for (int j =0; j < mSize; j++){
            rowSum += matrix[i][j];
            colSum += matrix[j][i];
        }
        if (rowSum != colSum || colSum != sumd1)
            return false;
    }
    return true;
}
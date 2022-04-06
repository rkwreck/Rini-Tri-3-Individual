package src;

public class Matrix {
    private final int[][] matrix;

    // store matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Hack: create toString method using nested for loops to format output of a matrix
    //use hexadecimal so the output has letters in place of numbers greater than 9

    public String toString() {
        String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "a","b", "c","d", "e", "f",};
        String string = "";
        for (int[] innerMatrix : matrix)  //loop for keypad
        {
            for (int val : innerMatrix)
            {
                //check if number falls within the hexadecimal array to assign it the corresponding number or letter
                if (val >= 0 && val < 16) {
                    string += hexArray[val] + " ";
                }

                else  //negative numbers are replaced with spaces
                {
                    string += "  ";
                }
            }
            string += "\n";
            //System.out.println(" ");
        }

        string += "\n";

        for (int i = matrix.length-1; i >= 0; i--)  //loop for number systems
        {
            for (int j = matrix[i].length-1; j >= 0; j--)
            {
                if ((matrix[i][j] >= 0) && (matrix[i][j] < 16) ){
                    string += hexArray[matrix[i][j]] + " ";
                }

                else
                {
                    string += "  ";
                }
            }
            string += "\n";
        }

        return string;
    }

    // declare and initialize a matrix for a keypad
    static int[][] keypad() {
        return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
    }

    // declare and initialize a random length arrays
    static int[][] numbers() {
        return new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

    // tester method for matrix formatting
    public static void main(String[] args) {
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        //System.out.println(m0);
        System.out.println(m0.toString());

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1);
    }

}

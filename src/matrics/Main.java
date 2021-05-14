package matrics;

public class Main {
    static int[][] a = new int[][]{
            {3,7,5},{2,4,9}
    };
    static int[][] b = new int[][]{
            {7,2,9},{1,8,5},{0,2,4}
    };
    static int[][] c = new int[2][3];

    static int[][] matrics4 = new int[][]{
            {2,5,9,8,1},{8,9,-5,2,7},{1,8,7,9,2},{-2,4,0,7,2}
    };

    static int result = 0;

    public static void main(String[] args) {
        for (int k = 0;k < a.length;k++){
            for (int j = 0;j<b.length;j++){
                for (int i = 0;i < a[0].length;i++){
                   result = result + (a[k][i] * b[i][j]);
                }
                c[k][j] = result;
                result = 0;

            }

        }
        for (int i = 0;i < c.length;i++){
            System.out.println("");
            for (int j = 0;j < c[0].length;j++){
                System.out.print(c[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println();

            int result = 1;
            for (int i = 0; i < matrics4.length; i++){
                for (int j = 0; j < matrics4[0].length; j++){
                    if (i == j){
                        result = result * matrics4[i][j];
                    }
                }
            }
            System.out.print(result + ", ");



            int result2 = 1;
            for (var i = 0; i < matrics4.length; i++){
                for (var j = 0; j < matrics4[0].length; j++){
                    if (j == matrics4[0].length-1-i){
                        result2 = result2 * matrics4[i][j];
                    }
                }
            }
            System.out.println(result2);
        }

}

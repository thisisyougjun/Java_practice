public class MultiDimension {
    public static void main(String[] args) {
        int[][] array2={
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {9,10,11}
        };
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

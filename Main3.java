public class Main3 {

    public static void main (String [] args) {

        int [] array = { 0, 0 ,0,0,0,0,0,1,1,1,1,1,1};
        for ( int i=0; i< array.length; i++) {
            if (array[i] == 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        System.out.println();

        int[] array2 = new int[100];
        for (int i=1; i< array2.length; i++) {
            array2[i] = i;
            System.out.print( array2[i]);
        }
        System.out.println();

        int[][] array3 = new int[3][3];
        for (int i =0; i< array3.length; i++) {
            for ( int j = 0; j < array3.length; j++) {
                if (i == j) {
                    array3[i][j] = 1;
                }System.out.print(array3[i][j]);
            }

        }
        System.out.println();

        int[] array4 = {1, 2,3,4,5,6,7,8,9,10};
        for (int i=1; i < array4.length; i++) {
            if (array4[i] < 6) {
                array4[i]= i*2;
            }
            System.out.print( array4[i] + " ");
        }
        System.out.println();

        array( 5,10);
    }

    public static int[] array (int len, int initialValue) {
        int[] array5 = new int[len];
        for ( int i = 0; i < array5.length ; i++) {
            array5[i]=initialValue;
        }
        return array5;

    }
    }





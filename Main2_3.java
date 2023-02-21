public class Main2_3 {
    public static void main (String[] args){
        home1( 100, -50);
        home2(99);
        home3("Приветулечки", 10);
        home4(-10);
        System.out.println();
        int[] array = {1,1,1,0,0,0};
        for (int i=0; i<array.length; i++) {
            if (array[i] == 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        System.out.println();
        int [] two = new int[100];
        for ( int i = 1; i<two.length; i++) {
            two[i]=i;
            System.out.print(two[i] +" ");
        }
        System.out.println();

        int[] three = {1,2,3,4,5,6,7,8,9};
        for (int i=1; i< three.length; i++){
            if ( three[i] < 6) {
                three[i]=i*2;
            }
            System.out.print(three[i] + " ");
        }
        System.out.println();

        int[][] kvarta = new int[3][3];
        for ( int i=0; i < kvarta.length; i++) {
            for ( int j=0; j< kvarta.length; j++) {
                if ( i==j) {
                    kvarta[i][j] = 5;
                }
                System.out.print(kvarta[i][j]);
            }
        }
        System.out.println();
        myArray(10, 11);


    }

    public static boolean home1 ( int x, int y) {
        if (x+y >=10 && x+y <=20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return true;
    }

    public static void home2( int x) {
        if ( x>=0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static void home3 (String x , int y){
        for(int i=0; i<y; i++) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static boolean home4 (int x) {
        if ( x>0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return true;
    }

    public static int[] myArray ( int len, int initial) {
        int[] arr = new int[len];
        for (int i=0; i < arr.length; i++) {
            arr[i]= initial;
            System.out.print(arr[i] + " ");
        }
        return arr;

    }

}


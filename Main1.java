public class Main1 {
    public static  void main (String[] args) {
        printThreeVorlds();
        checkSumSing();
        printColor();
        compareNumbers();

    }
    public static  void printThreeVorlds() {
        System.out.println( "Orange");
        System.out.println ( "banana");
        System.out.println( "Apple");
    }

    public  static  void checkSumSing() {
        int a =1;
        int b = 2;
        if(a+b >= 0) {
            System.out.println( "Сумма положительная");
        } else {
            System.out.println( "умма отрицательная");
        }
    }
    public static void  printColor() {
        int value = 100;
        if (value<=0) {
            System.out.println( "Красный");
        } else if (value >0  && value<=100) {
            System.out.println( "Желтый");
        }  else if (value > 100) {
            System.out.println( "Зеленый");
        }
    }
    public  static  void  compareNumbers () {
        int a = 4634;
        int b = 999;
        if (a >= b) {
            System.out.print ( "a>=b");
        } else {
            System.out.println( a<b);
        }
    }

    }


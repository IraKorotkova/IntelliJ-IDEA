public class Main2 {
    public  static void main(String[] args){
        home1( 7,87);
        home2(0);
        home3(167);
        home4("hello", 1);


    }

    public static boolean home1 (int x, int y){
       int z=x+y;
       if (z>=10 && z<=20) {
           System.out.println("true");
       }else   {
            System.out.println( "false");
        }
        return true;
    }
    public  static void home2 (int x){
        if(x<0) {
            System.out.println("Отрицательное число");
        } else if (x>=0) {
            System.out.println("Положительное число");
        }
    }

    public static boolean home3 (int x) {
        if (x<0) {
            System.out.println(true);
        } else if (x>0) {
            System.out.println(false);
        }
        return true;
    }
    public static void home4 (String a, int b){
        int i=10;
        while(b < i) {
            b++;
            System.out.println(a);
        }
    }

}

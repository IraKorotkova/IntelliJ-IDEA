import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public  static  char[][] map;
    public static final int SIZE = 3;
    public  static  final char DOT_X = 'x';
    public static  final  char DOT_0 = '0';
    public static final char DOT = '.';

    public static void  main (String[] args){
        initMap();
        showMap();
        while (true) {
            human();
            showMap();
            if (win(DOT_X)) {
                System.out.println("Победил человек!!!!!");
                break;
            }
            if (isMapFuul()) {
                System.out.println("Ничья");
                break;
            }
            ai();
            showMap();

            if (win(DOT_0)) {
                System.out.println("Победил Компьютер!!!");
                break;
            }
            if (isMapFuul()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static void  initMap () {
        map = new char[SIZE][SIZE];
        for (int row=0; row < SIZE; row++) {
            for (int column = 0; column<SIZE; column++) {
                map[row][column]= DOT;
            }
        }
    }
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void human( ) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isvalid(x, y));
        map[y][x] = DOT_X;

    }
    public static boolean isvalid(int x, int y) {

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT;
    }
    public static void ai() {

        Random random = new Random();
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isvalid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
    }
    public static boolean win(char win) {
        for (int i = 0; i < SIZE; i++)
            if ((map[i][0] == win && map[i][1] == win && map[i][2] == win) ||
                    (map[0][i] == win && map[1][i] == win && map[2][i] == win)) {
                return true;
            }
        if ((map[0][0] == win && map[1][1] == win && map[2][2] == win) ||
                (map[2][0] == win && map[1][1] == win && map[0][2] == win)) {
            return true;
        }

        return false;
    }
    public static boolean isMapFuul() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (map[row][column] == DOT) {
                    return false;
                }
            }
        }


        return true;
    }

    }


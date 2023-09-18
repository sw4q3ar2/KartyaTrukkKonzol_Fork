package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukkKonzolon {

    private static String[] pakli = new String[22];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            melyik();
        }
    }

    private static void melyik() {
        System.out.print("melyik oszlop (1-3): ");
        int oszlop = sc.nextInt();
    }

}

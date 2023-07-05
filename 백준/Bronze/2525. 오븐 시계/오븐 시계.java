import java.util.Scanner;

/**
 *
 * @author CHOEUNJIN
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int clock = ((A * 60) + B + C) / 60;
        int minute = ((A * 60) + B + C) % 60;

        if (clock > 23) {
            clock = clock - 24;
        }

        System.out.println(clock + " " + minute);
    }
}
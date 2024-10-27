import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int multi=1;

            for(int j = 1; j <= b; j++){
                multi=(multi*a)%10;
            }
            if(multi==0) {
                multi=10;
            }
            System.out.println(multi);
        }
    }
}
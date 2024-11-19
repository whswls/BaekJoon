import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        int count = 0 ;

        for(int i=0;i<5;i++){
            int n = reader.nextInt();
            if(n==T){
                count++;
            }
        }
        System.out.print(count);
    }
}
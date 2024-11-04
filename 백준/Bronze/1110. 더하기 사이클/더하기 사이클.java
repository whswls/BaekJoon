import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int original=n;
        int count=0;

        do{
            count++;
            int a= n/10; // 10의자리
            int b= n%10; // 1의자리
            int sum = a + b;

            n = (b*10) + (sum%10);

        }while(n!=original);

        System.out.println(count);
    }
}
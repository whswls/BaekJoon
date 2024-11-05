import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[] list = new int[20];

        for(int i = 1; i <= T; i++) {
            int count = 0;
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            
            Integer.parseInt(tk.nextToken());

            for(int k = 0; k < 20; k++) {
                list[k] = Integer.parseInt(tk.nextToken());
            }

            for(int j=0; j < 20; j++) {
                for(int l = 0; l < j; l++) {
                    if(list[j]<list[l]){
                        count++;
                    }
                }
            }
            System.out.println(i+" "+count);
        }
    }
}
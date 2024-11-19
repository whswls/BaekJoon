import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(r.readLine());

        int[] list = new int[n];

        for(int i=0; i<n; i++){
            list[i]  = Integer.parseInt(tk.nextToken());
        }

        int result = search(list, n, m);
        System.out.println(result);
    }
    static int search(int[] list, int n, int m){
        int value = 0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int tmp = list[i]+list[j]+list[k];

                    if(tmp == m){
                        return tmp;
                    }

                    if(value < tmp && tmp < m){
                        value = tmp;
                    }
                }
            }
        }
        return value;
    }
}
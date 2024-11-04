import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S="";
        long L=0; // 값 저장 변수

        for(int i=0;i<3;i++){
            String r = reader.readLine();

            switch (r){
                case "black":
                    if(i==2){
                        L*=1;
                    }
                    else{
                        S+="0";
                    }
                break;
                case "brown":
                    if(i==2){
                        L*=10;
                    }
                    else{
                        S+="1";
                    }
                break;
                case "red":
                    if(i==2){
                        L*=100;
                    }
                    else{
                        S+="2";
                    }
                    break;
                case "orange":
                    if(i==2){
                        L*=1000;
                    }
                    else{
                        S+="3";
                    }
                    break;
                case "yellow":
                    if(i==2){
                        L*=10000;
                    }
                    else{
                        S+="4";
                    }
                    break;
                case "green":
                    if(i==2){
                        L*=100000;
                    }
                    else{
                        S+="5";
                    }
                    break;
                case "blue":
                    if(i==2){
                        L*=1000000;
                    }
                    else{
                        S+="6";
                    }
                    break;
                case "violet":
                    if(i==2){
                        L*=10000000;
                    }
                    else{
                        S+="7";
                    }
                    break;
                case "grey":
                    if(i==2){
                        L*=100000000;
                    }
                    else{
                        S+="8";
                    }
                    break;
                case "white":
                    if(i==2){
                        L*=1000000000;
                    }
                    else{
                        S+="9";
                    }
                    break;
            }
            if(i==1){
                L=Long.parseLong(S); // 형변환
            }

        }
        System.out.println(L);
    }
}
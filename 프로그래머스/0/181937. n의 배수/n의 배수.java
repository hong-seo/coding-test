import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int num, int n) { 
        return (num % n == 0) ? 1 : 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=0;
        int n=0;
        while(true){
            try{
                String line = br.readLine();
                if (line == null) continue;
                num = Integer.parseInt(line.trim());
                if (num >= 2 && num <= 100) break;
                if (num >= 2 && num <= 100) break;
                System.out.println("2<=num<=100");
            }catch(NumberFormatException e){
                System.out.println("none");
            }
        }
        while(true){
            try{
                String line = br.readLine();
                if (line == null) continue;
                n = Integer.parseInt(line.trim());
                if (n >= 2 && n <= 9) break;
                System.out.println("2<=n<=9");
            }catch(NumberFormatException e){
                System.out.println("none");
            }
        }
        int sol = solution(num,n);
        System.out.println(sol);
        
    }
}
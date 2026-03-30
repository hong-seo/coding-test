import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int n, String control) {
        int count = control.length();
        for(int i=0; i<count; i++){
            if(control.charAt(i)== 'w'){
                n+=1;
            }
            else if(control.charAt(i)== 's'){
                n-=1;
            }
            else if(control.charAt(i)== 'd'){
                n+=10;
            }
            else if(control.charAt(i)== 'a'){
                n-=10;
            }
        }
        return n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String control = br.readLine();
        System.out.println(solution(n, control));
    }
}
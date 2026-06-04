import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i)=='0'){
                if(mode == 0){
                    mode =1;
                }
                else{
                    mode =0;
                }
            }
            else if(code.charAt(i)=='1'){
                if(mode == 1){
                    mode =0;
                }
                else{
                    mode =1;
                }
            }
            else if(mode ==0 && i%2==0){
                sb.append(code.charAt(i));
            }
            else if(mode ==1 && i%2!=0){
                sb.append(code.charAt(i));
            }
        }
        if(sb.isEmpty()){
            return "EMPTY";
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine().replace("\"","");
        System.out.println(solution(st));
    }
}
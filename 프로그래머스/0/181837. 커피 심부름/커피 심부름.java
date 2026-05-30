import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String[] order) {
        int count=0;
        for(String st : order){
            if(st.contains("latte")){
                count+=5000;
            }
            else{
                count+=4500;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.substring(2,str.length()-2);
        String[] order = str.split("\", \"");
        System.out.println(solution(order));
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String myString, String pat) {
        int count=0;
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            String my = myString.substring(i, pat.length()+i);
            if(my.contains(pat)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine().replace("\"","");
        String pat = br.readLine().replace("\"","");
        System.out.println(solution(my, pat));
    }
}
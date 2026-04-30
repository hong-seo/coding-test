import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int count= str1.length()>str2.length()? str1.length():str2.length();
        for(int i=0; i<count; i++){
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().replace("\"","");
        String str2 = br.readLine().replace("\"","");
        System.out.println(solution(str1, str2));
    }
}
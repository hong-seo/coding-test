import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String myString) {
        char st = 'l';
        char[] arr =myString.toCharArray();
        for(int i=0; i<myString.length(); i++){
            if((int)arr[i]<(int)st){
                arr[i]='l';
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myString = br.readLine();
        System.out.println(solution(myString));
    }
}
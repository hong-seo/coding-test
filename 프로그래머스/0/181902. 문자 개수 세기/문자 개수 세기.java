import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)<91){
                answer[(my_string.charAt(i)-'A')]+=1;
            }
            else{
                answer[(my_string.charAt(i)-'A'-6)]+=1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine().replace("\"","");
        System.out.println(Arrays.toString(solution(st)));
    }
}
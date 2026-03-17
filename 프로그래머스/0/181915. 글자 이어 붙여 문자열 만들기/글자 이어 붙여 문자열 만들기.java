import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            char c = my_string.charAt(index_list[i]);
            answer.append(c);
        }
        return answer.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        String myString = br.readLine();
        StringTokenizer k = new StringTokenizer(br.readLine(), ", ");

        int count = k.countTokens();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(k.nextToken());
        }

        System.out.println(solution(myString, arr));

    }
}
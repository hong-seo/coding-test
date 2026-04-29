import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<numLog.length; i++){
            switch(numLog[i]- numLog[i-1]){
                case (1):
                    sb.append('w');
                    break;
                case (-1):
                    sb.append('s');
                    break;
                case (10):
                    sb.append('d');
                    break;
                case (-10):
                    sb.append('a');
                    break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }
}
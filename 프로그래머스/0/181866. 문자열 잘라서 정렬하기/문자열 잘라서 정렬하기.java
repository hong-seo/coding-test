import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String myString) {
        StringTokenizer st =new StringTokenizer(myString,"x");
        int count = st.countTokens();
        String[] arr = new String[count];
        for(int i=0; i<count; i++){
            arr[i]=st.nextToken();
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = new String(br.readLine());
        System.out.println(Arrays.toString(solution(my)));
    }
}
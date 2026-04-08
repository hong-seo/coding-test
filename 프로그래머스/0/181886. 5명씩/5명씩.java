import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String[] names) {
        int count= (names.length%5==0 ? names.length/5 : names.length/5+1);
        String[] arr =new String[count];
        for(int i=0; i<count; i++){
            arr[i]=names[5*i];
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int count = st.countTokens();
        String[] arr = new String[count];
        for(int i=0; i<count; i++){
            arr[i]=st.nextToken();
        }
        System.out.println(Arrays.toString(solution(arr)));

    }
}
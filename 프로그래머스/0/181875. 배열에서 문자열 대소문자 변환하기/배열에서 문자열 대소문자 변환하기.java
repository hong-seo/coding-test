import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String[] strArr) {
        int count = strArr.length;
        for(int i =0; i<count; i++){
            if(i%2==0){
                strArr[i] = strArr[i].toLowerCase();
            }
            else{
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
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
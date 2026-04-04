import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String[] strArr) {
        ArrayList<String> arr= new ArrayList<>();
        for(String str : strArr){
            if(!str.contains("ad")){
                arr.add(str);
            }
        }
        return arr.toArray(new String[0]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"\", ");
        int count = st.countTokens();
        String[] arr = new String[count];
        for(int i=0; i<count; i++){
            arr[i] = st.nextToken();
        }
        System.out.println(Arrays.toString(solution(arr)));
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String solution(String[] str_list, String ex) {
        int count =str_list.length;
        StringBuilder sb = new StringBuilder();
        for(String s : str_list){
            if(!s.contains(ex)){
                sb.append(s);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"\", ");
        int count = st.countTokens();
        String[] arr = new String[count];
        for(int i=0; i<count; i++){
            arr[i]=st.nextToken();
        }
        String ex = br.readLine().replace("\"","");
        System.out.println(solution(arr, ex));
    }
}
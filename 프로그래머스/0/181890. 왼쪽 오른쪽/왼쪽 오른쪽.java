import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String[] str_list) {
        int count =0;
        for(String c : str_list){
            if(c.contains("l")){
                String[] left = Arrays.copyOfRange(str_list,0, count);
                return left;
            }
            if(c.contains("r")){
                String[] right = Arrays.copyOfRange(str_list,count+1, str_list.length);
                return right;
            }
            count++;
        }
        String[] answer={};
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lr = br.readLine();
        lr = lr.substring(2, lr.length()-2);
        StringTokenizer st = new StringTokenizer(lr,"\", ");
        int count = st.countTokens();
        String[] str = new String[count];
        for(int i=0; i<count; i++){
            str[i]=st.nextToken();
        }
        System.out.println(Arrays.toString(solution(str)));
    }
}
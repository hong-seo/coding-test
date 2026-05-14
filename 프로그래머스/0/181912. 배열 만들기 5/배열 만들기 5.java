import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr =new ArrayList<>();
        int count = intStrs.length;
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num>k){
                arr.add(num);
            }
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine(),"[]\", ");
        int count = st.countTokens();
        String[] intStrs = new String[count];
        for(int i=0; i<count; i++){
            intStrs[i] = st.nextToken();
        }
        int k = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
    }
}
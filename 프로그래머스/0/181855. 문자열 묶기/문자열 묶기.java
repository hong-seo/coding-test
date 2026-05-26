import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class Solution {
    public static int solution(String[] strArr) {
        Map<Integer, Integer> groupCounts = new HashMap<>();
        for (String str : strArr) {
            int length = str.length();
            groupCounts.put(length, groupCounts.getOrDefault(length, 0) + 1);
        }
        int count = 0;
        for (int i : groupCounts.values()) {
            if(i>count){
                count = i;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String st = str.substring(2, str.length()-2);
        String[] arr = st.split("\",\"");
        System.out.println(solution(arr));
    }
}
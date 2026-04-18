import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.IOException;

public class Solution {

    public static int[] solution(int[] num_list, int n) {
        LinkedList<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < num_list.length; i++){
            q.offer(num_list[i]);
        }
        for(int i = 0; i < n; i++){
            int temp = q.pollFirst();
            q.offerLast(temp);
        }
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            answer[i] = q.pollFirst();
        }
        
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ", ");
        int count = st.countTokens();
        int[] num_list = new int[count];
        for(int i = 0; i < count; i++){
            num_list[i] = Integer.parseInt(st.nextToken().trim());
        }
    
        int n = Integer.parseInt(br.readLine().trim());
        int[] result = solution(num_list, n);
        System.out.println( Arrays.toString(result));
    }
}
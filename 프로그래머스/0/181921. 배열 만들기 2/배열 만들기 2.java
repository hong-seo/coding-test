import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        int num = l;
        while (num <= r) {
            String n = String.valueOf(num);
            boolean isOnlyZeroFive = true;
            for (int i = 0; i < n.length(); i++) {
                char ch = n.charAt(i);
                if (ch != '0' && ch != '5') {
                    isOnlyZeroFive = false;
                    break;
                }
            }
            if (isOnlyZeroFive) {
                arr.add(num); 
            }
            num++;
        }
        if (arr.isEmpty()) {
            return new int[]{-1};
        }
        
        return arr.stream().mapToInt(j -> j).toArray();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(l, r)));
    }
}
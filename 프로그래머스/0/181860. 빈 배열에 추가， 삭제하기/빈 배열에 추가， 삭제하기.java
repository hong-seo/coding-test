import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                int repeatCount = arr[i] * 2;
                for (int j = 0; j < repeatCount; j++) {
                    X.add(arr[i]);
                }
            } else {
                int removeCount = arr[i];
                for (int j = 0; j < removeCount; j++) {
                    X.remove(X.size() - 1); 
                }
            }
        }
        return X.stream().mapToInt(num -> num).toArray();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arrStr = br.readLine();
        arrStr = arrStr.substring(1, arrStr.length() - 1);
        StringTokenizer st1 = new StringTokenizer(arrStr, ", ");
        int arrCount = st1.countTokens();
        int[] arr = new int[arrCount];
        for (int i = 0; i < arrCount; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        String flagStr = br.readLine();
        flagStr = flagStr.substring(1, flagStr.length() - 1);
        StringTokenizer st2 = new StringTokenizer(flagStr, ", ");
        int flagCount = st2.countTokens();
        boolean[] flag = new boolean[flagCount];
        for (int i = 0; i < flagCount; i++) {
            flag[i] = Boolean.parseBoolean(st2.nextToken());
        }
        int[] result = solution(arr, flag);
        System.out.println(Arrays.toString(result));
    }
}
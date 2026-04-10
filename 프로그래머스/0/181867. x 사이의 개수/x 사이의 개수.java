import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(String myString) {
        String[] my = myString.split("x", -1);
        int[] arr = new int[my.length];
        for(int i=0; i<my.length; i++){
            arr[i]=my[i].length();
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = new String(br.readLine());
        System.out.println(Arrays.toString(solution(st)));
    }
}
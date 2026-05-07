import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
                list.add(n);
            }
            else{
                n=3*n+1;
                list.add(n);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(n)));
    }
}
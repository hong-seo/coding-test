import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String[] todo_list, boolean[] finished) {
        int count =0;
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                count++;
            }
        }
        String[] str = new String[count];
        int j=0;
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                str[j] = todo_list[i];
                j++;
            }
        }
        return str;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(),", ");
        int count = st1.countTokens();
        String[] str = new String[count];
        for(int i=0; i<count; i++){
            str[i]=st1.nextToken();
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine(),", ");
        count = st2.countTokens();
        boolean[] bor = new boolean[count];
        for(int i=0; i<count; i++){
            bor[i] = Boolean.parseBoolean(st2.nextToken());
        }
        System.out.println(Arrays.toString(solution(str, bor)));
    }
}
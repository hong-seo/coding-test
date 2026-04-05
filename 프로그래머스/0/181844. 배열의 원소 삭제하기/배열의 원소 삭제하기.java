import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean bool = true;
            for(int j=0; j<delete_list.length; j++){
                if(delete_list[j]==arr[i]){
                    bool = false;
               }
            }
            if(bool){
                array.add(arr[i]);
               }
        }
        return array.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(),", ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(),", ");
        int count1 = st1.countTokens();
        int count2 = st2.countTokens();
        int[] arr = new int[count1];
        int[] del = new int[count2];
        for(int i=0; i<count1; i++){
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        for(int i=0; i<count2; i++){
            del[i]=Integer.parseInt(st2.nextToken());
        }
        System.out.println(Arrays.toString(solution(arr, del)));
    }
}
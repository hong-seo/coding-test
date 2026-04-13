import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int[] num_list) {
        int total=0;
        int count =1;
        if(num_list.length>10){
            for(int i=0; i<num_list.length; i++){
                total+=num_list[i];
            }
            return total;
        }
        else{
            for(int i=0; i<num_list.length; i++){
                count*=num_list[i];
            }
            return count;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(",");
        int num[] = new int[str.length];
        for(int i =0; i<str.length; i++){
            num[i]=Integer.parseInt(str[i].trim());
        }
        System.out.println(solution(num));
    }
}
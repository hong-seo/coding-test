import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;

public class Solution {
    public static int solution(int[] nums) {
        int count = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        if(map.size()>count){
            return count;
        }
        return map.size();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        str1= str1.substring(1,str1.length()-1);
        String[] str = str1.split(",");
        int[] nums = new int[str.length];
        for(int i=0; i<str.length; i++){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(solution(nums));
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;

public class Solution {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer="";
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            map.put(c,map.get(c)-1);
        }
        for(String key : map.keySet()){
            if(map.get(key)!=0){
                answer= key;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        str1= str1.substring(2,str1.length()-2);
        String[] participant = str1.split("\", \"");
        String str2 = br.readLine();
        str2= str2.substring(2,str2.length()-2);
        String[] completion = str2.split("\", \"");
        System.out.println(solution(participant, completion));
    }
}
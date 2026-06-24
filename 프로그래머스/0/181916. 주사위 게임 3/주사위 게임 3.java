import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class Solution {
    public static int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : dice) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int p=0,q=0,r=0;
        if(map.containsValue(4)){
            return a*1111;
        }
        else if(map.containsValue(3)){
            for (int key : map.keySet()) {
                if (map.get(key) == 3){
                    p = key;
                }
                if (map.get(key) == 1){
                    q = key;
                }
            }
            return (10*p+q)*(10*p+q);
        }
        else if(map.containsValue(2)){
            if(map.containsValue(1)){
                for (int key : map.keySet()) {
                    if (map.get(key) == 2){
                        p = key;
                    }
                    if (map.get(key) == 1){
                        if(q==0) q= key;
                        else r = key;
                    }
                }
                return q*r;
            }
            else{
                for (int key : map.keySet()) {
                    if (map.get(key) == 2){
                        if (p == 0) {
                            p = key;
                        } else {
                            q = key;
                        }
                    }
                }
                return p>q ? (p + q)*(p-q):(p + q)*(q-p);            
            }
        }
        return Math.min(Math.min(a, b),Math.min(c, d));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        System.out.println(solution(a, b, c, d));
    }
}
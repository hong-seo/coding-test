import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>[] list = new ArrayList[26];
        int T = Integer.parseInt(br.readLine());

        for(int j=0; j<T; j++){
            for(int i = 0; i < 26; i++){
                list[i] = new ArrayList<>(); 
            }
            int min = Integer.MAX_VALUE;
            int max = -1;
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());
            for(int i=0; i<W.length(); i++){
                list[W.charAt(i)-'a'].add(i);
            }
            for(int i=0; i<26; i++){
                if(list[i].size()>=K){
                    for (int p = 0; p <= list[i].size() - K; p++) {
                        int start = list[i].get(p);
                        int end = list[i].get(p + K - 1);
                        int length = end - start + 1;
                        min = Math.min(min, length);
                        max = Math.max(max, length);
                    }
                }
            }
            if(max==-1){
                System.out.println(max);
            }
            else{
                System.out.println(min +" "+ max);
            }
        }
    }
}
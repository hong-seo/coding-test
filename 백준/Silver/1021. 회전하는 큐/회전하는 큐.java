import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> q = new LinkedList<>();

        for(int i=1; i<=N; i++){
            q.offer(i);
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int c = st2.countTokens();
        int[] arr = new int[c];
        for(int i=0; i<c; i++){
            arr[i]=Integer.parseInt(st2.nextToken());
        }
        
        int count =0;
        for(int i =0; i<M; i++){
            int target = arr[i];

            int seq = q.indexOf(target);
            int half;
            if(q.size()%2==0){
                half = q.size()/2-1;
            }
            else{
                half = q.size()/2;
            }

            if(seq<=half){
                for(int j = 0; j < seq; j++) {
                    int temp = q.pollFirst();
                    q.offerLast(temp);
                    count++;
                }
            }
            else if (seq>half){
                for(int j =0; j<q.size()-seq; j++){
                    int temp = q.pollLast();
                    q.offerFirst(temp);
                    count++;
                }
            }
            q.pollFirst();
        }
        System.out.println(count);
    }
}
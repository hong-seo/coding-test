import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replace("[", "").replace("]", "").replace("\"", "");
        String[] temp = str.split(",");
        String[] phone_book = new String[temp.length];
        for (int i = 0; i < temp.length; i++) {
            phone_book[i] = temp[i].trim();
        }
        System.out.println(solution(phone_book));
    }
}
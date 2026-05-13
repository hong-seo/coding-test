import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int[][] board, int k) {
        int answer = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                } else {
                    break;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String boardStr = br.readLine();
        boardStr = boardStr.substring(2, boardStr.length() - 2);
        String[] rows = boardStr.split("\\],\\[");
        int[][] board = new int[rows.length][];
        
        for (int i = 0; i < rows.length; i++) {
            String[] cols = rows[i].split(", ");
            board[i] = new int[cols.length];
            
            for (int j = 0; j < cols.length; j++) {
                board[i][j] = Integer.parseInt(cols[j].trim());
            }
        }
        int k = Integer.parseInt(br.readLine());
        System.out.println(solution(board, k));
    }
}
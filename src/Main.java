import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer1;
    static int answer2;
    static int count;

    public static void main(String[] args) {
        answer1 = 0;
        answer2 = 0;

        // 1
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        //2
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                if ((board[i][j] == 1) && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    answer1++;

                    if(answer2 < count) {
                        answer2 = count;
                    }
                }
            }
        }
        System.out.println(answer1);
        System.out.println(answer2);
    }

    public static void dfs(int x, int y) {
        count++;
        visited[x][y] = true;

        int nx, ny;

        for(int i = 0; i < 4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                if (board[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
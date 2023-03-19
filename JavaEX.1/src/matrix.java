import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int r;//row
        int c;//column
        int amount;
        r = sc.nextInt();
        c = sc.nextInt();
        amount = sc.nextInt();
        int[] funtion = new int[amount];
        int[][] data = new int[r][c];
        int[][] newdata = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                data[i][j] = sc.nextInt();
            }
        }//輸入矩陣
        for (int i = 0; i < amount; i++) {
            funtion[i] = sc.nextInt();
        }//動作們
        for (int i = 0; i < amount; i++) {
            if(funtion[i] == 1){
                for (int j = 0; j < r; j++) {
                    for (int k = 0; k < c; k++) {
                        newdata[j][k] = data[(r-1)-j][k];
                    }
                }
                data = newdata;//route
                newdata = new int[r][c];
            }
            else if (funtion[i] == 0){
                c = data.length;
                r = data[0].length;
                newdata = new int[r][c];
                for (int j = 0; j < r; j++) {
                    for (int k = 0; k < c; k++) {
                        newdata[j][k] = data[c-1-k][j];
                    }
                }
                data = newdata;//route
                newdata = new int[r][c];
            }
        }
        System.out.println(r+" "+c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

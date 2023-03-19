import java.util.Arrays;
import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        int amount = 0;
        int best = 0;
        int worst = 0;
        String mes = "best case";
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        int scorelist[] = new int[amount];
        for (int i = 0; i < amount; i++) {
            scorelist[i] = sc.nextInt();
        }//輸入陣列們
        Arrays.sort(scorelist);
        for (int i = 0; i < amount; i++) {
            System.out.print(scorelist[i] + " ");
        }//輸出陣列們
        System.out.println(" ");
        int Maxscore = scorelist[amount - 1];
        int minscore = scorelist[0];
        if (minscore < 60){
            amount = amount-1;
            while(true){
                worst = scorelist[amount];
                if (worst < 60){
                    break;
                }
                amount--;
            }
            System.out.println(scorelist[amount]);
        }
        else{
            mes = "best case";
            System.out.println(mes);
        }
        int i = 0;
        if (Maxscore >= 60){
                while(true){
                    best = scorelist[i];
                    if (best>=60){
                        break;
                    }
                    i++;
                }
            System.out.println(best);
        }
        else {
            mes = "worst case";
            System.out.println(mes);
        }

    }
}
//3
//0 11 55 22 99 66 88
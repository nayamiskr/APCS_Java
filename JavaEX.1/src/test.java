import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class test {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            int n=  input.nextInt();
            int ans=0;
            HashMap<Integer,Integer> S = new HashMap<>();
            ArrayList<Integer> n2 = new ArrayList<>();
            for (int i =0;i<n;i++){
                int a = input.nextInt();
                int b = input.nextInt();
                if (S.containsKey(a)){
                    if (b>S.get(a)){
                        S.put(a,b);
                    }
                }
                else{
                    S.put(a,b);
                    n2.add(a);
                }
            }
            Collections.sort(n2);
            int End =-1;
            int Start=-1;
            for (int i =0;i<n2.size();i++){
                if (n2.get(i)>End){
                    ans+=End-Start;
                    Start=n2.get(i);
                    End= S.get(n2.get(i));
                }
                else{
                    if (S.get(n2.get(i))>End){
                        End=S.get(n2.get(i));
                    }
                }
            }
            ans += End- Start;
            System.out.println(ans);
        }
    }
}
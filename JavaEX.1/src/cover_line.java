import java.util.*;

public class cover_line {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        HashMap<Integer, Integer> linelist = new HashMap<>();
        ArrayList<Integer> fline = new ArrayList<>();
        ArrayList<Integer> bline = new ArrayList<>();
        while (sc.hasNextInt()) {
            int s;
            int e;
            int start = -1;
            int end = -1;
            int ans = 0;
            for (int i = 0; i < amount; i++) {
                s = sc.nextInt();
                e = sc.nextInt();
                if(linelist.containsKey(s)){
                    if(e>s){
                        linelist.put(s,e);
                    }
                }
                else{
                    linelist.put(s,e);
                    fline.add(s);
                    bline.add(e);
                }
            }
            Collections.sort(fline);
            Collections.sort(bline);

            for (int i = 0; i < amount; i++) {
                if(fline.get(i) > end){
                    ans+= end-start;
                    start = fline.get(i);
                    end = bline.get(i);
                }
                else{
                    if(bline.get(i) > end){
                        end = bline.get(i);

                    }
                }
            }
            ans+= end-start;
            System.out.println(ans);
        }
    }
    }
/*
5
160 180
150 200
280 300
300 330
190 210

150 200
160 180
190 210
280 300
300 330
*/
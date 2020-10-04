package Tasks;

public class Task_4 {
    public static int result4(int k,int s,int sum,int dl) {
        if (dl == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (dl == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res +=result4(k, s, sum + i, dl + 1);
        }
        return res;
    }
}

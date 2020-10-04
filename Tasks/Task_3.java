package Tasks;

public class Task_3 {
    public static String result3(int a,int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + result3(a - 1, b);
        }
        else {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + result3(a + 1, b);
        }
    }
}

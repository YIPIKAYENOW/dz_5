package Tasks;

public class Task_5 {
    public static int result5(int x, int sum) {
        if (x / 10 == 0) {
            sum += x;
            return sum;
        } else {
            sum += x % 10;
            x = x / 10;
            return (result5(x, sum));
        }
    }
}

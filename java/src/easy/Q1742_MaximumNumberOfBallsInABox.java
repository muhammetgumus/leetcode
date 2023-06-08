package src.easy;

import java.util.HashMap;
import java.util.Map;

public class Q1742_MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
        System.out.println(countBalls(5, 15));
    }

    public static int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            Integer key = numberTotals(i);
            Integer fetched = pairs.get(key);
            if (fetched != null) {
                pairs.put(key, fetched + 1);
                continue;
            }
            pairs.put(key, 1);
        }
        int max = 0;
        for (int curr : pairs.values()) {
            if (curr > max)
                max = curr;
        }
        return max;
    }

    public static int numberTotals(int num) {
        int res = 0;
        while (num > 0) {
            int remain = num % 10;
            res += remain;
            num = num / 10;
        }
        return res;
    }
}

package src.medium;

import java.util.ArrayList;
import java.util.List;

public class Q7_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse2(-1230));
    }

    public static int reverse(int x) {
        if (x == 0)
            return 0;
        if (x < 0)
            return -1 * reverseProcess(-x);
        return reverseProcess(x);
    }

    private static int reverseProcess(int x) {
        double result = 0;
        List<Integer> digits = new ArrayList<>();
        while (x != 0) {
            digits.add(x % 10);
            x = x / 10;
        }
        for (int i = digits.size() - 1, j = 0; i > 0; i--, j++) {
            result += digits.get(j) * Math.pow(10, i);
        }
        result += digits.get(digits.size() - 1);
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
            return 0;
        return (int) result;
    }

    public static int reverse2(int x) {
        long result=0;
        while(x!=0) {
            result=result*10+x%10;
            x=x/10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)result;
        }
    }
}

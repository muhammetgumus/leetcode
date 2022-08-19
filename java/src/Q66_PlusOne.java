package src;

public class Q66_PlusOne {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9,9}));
    }

    public static int[] plusOne(int[] digits) {
        if(digits.length==1 && digits[0]==9){
            return new int[]{1,0};
        }
        Long realValue = 0L;
        int lastIndex = digits.length - 1;
        digits[lastIndex] += 1;
        int carry = 0;
        for (int i = lastIndex; i >= 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                carry = 1;
                if (i - 1 == -1) {
                    carry = 1;
                    break;
                } else {
                    digits[i - 1] += 1;
                }
            }
            realValue += Long.valueOf(digits[i]) * (long) Math.pow(10, digits.length - 1 - i);
            carry=0;
        }
        if (carry != 0) {
            realValue += 1 * (long) Math.pow(10, digits.length);
            int[] extended = new int[digits.length+1];
            extended[0]=1;
            for(int i=0;i<digits.length;i++){
                extended[i+1]=digits[i];
            }
            return extended;
        }
        System.out.println(realValue);
        return digits;
    }
}
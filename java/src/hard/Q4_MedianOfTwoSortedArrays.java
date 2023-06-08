package src.hard;

public class Q4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        //int [] num1= {1,3};
        //int [] num2= {2};
        System.out.println(findMedianSortedArrays(num1, num2));
    }


    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        int combine[] = new int[num1.length + num2.length];
        if (num1.length == 0) {
            combine = num2;
        } else if (num2.length == 0) {
            combine = num1;
        } else if (num1.length == 0 && num2.length == 0) {
            return 0.0;
        } else {
            int i1 = num1.length;
            int i2 = num2.length;
            int totLen = i1 + i2;
            while (i1 > 0 && i2 > 0) {
                if (num1[i1 - 1] >= num2[i2 - 1]) {
                    combine[totLen - 1] = num1[i1 - 1];
                    i1--;
                } else {
                    combine[totLen - 1] = num2[i2 - 1];
                    i2--;
                }
                totLen--;
            }
            if (i1 > 0) {
                while (i1 != 0) {
                    combine[totLen - 1] = num1[i1 - 1];
                    totLen--;
                    i1--;
                }
            } else if (i2 > 0) {
                while (i2 != 0) {
                    combine[totLen - 1] = num2[i2 - 1];
                    totLen--;
                    i2--;
                }
            }
        }
        if (combine.length % 2 == 1) {
            return combine[(int) (combine.length - 1) / 2];
        } else {
            int index = (int) ((combine.length - 1) / 2);
            return (combine[index] + combine[index + 1]) / 2.0;
        }
    }
}
package src;

public class Q69_Sqrtx {
    public static void main(String[] args) {
        System.out.println(mySqrt(38));
    }


    public static int mySqrt(int x){
        int left=0;
        int right = x;

        while(left<right){
            int mid = left+(right-left)/2;
            if(x/mid <mid){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left-1;
    }
}

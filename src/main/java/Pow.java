public class Pow {
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        int temp = n / 2;
        if (n < 0) {
            temp = -temp;
            x = 1 / x;
        }
        double res = myPow(x, temp);
        if (n % 2 == 0) return res * res;
        return res * res * x;
    }
    //    public static double myPow(double x, int n) {
//        double res;
//        if (n == 0) return 1;
//        if (n == 1) return x;
//        if (n == -1) return x;
//
//        res = myPow(x, n / 2);
//
//        if (n > 0) {
//            if (n % 2 == 0) {
//                return res * res;
//            } else {
//                return x * res * res;
//            }
//
//        } else {
//            if (n % 2 == 0) {
//                return (1.0 / (res * res));
//            } else {
//                return (1.0 / (x / (res * res)));
//            }
//        }
//    }

    public static void main(String[] args) {
        System.out.println(myPow(8.84372, -5));
    }

}


//class Solution {
//    public static double myPow(double x, int n) {
//        if(n>=0) {
//            if(n==1) {
//                return x;
//            }
//            if(n==0) {
//                return 1;
//            }
//            else {
//                return x*myPow(x,n-1);
//            }
//        }
//        else {
//            if(n==-1) {
//                return 1.0/x;
//            }
//            else {
//                return 1.0/(x*myPow(x,(-1)*(n+1)));
//            }
//        }
//    }
//}


//class Solution {
//    public static double myPow(double x, int n) {
//        if (n == 0) return 1;
//        if (n == 1) return x;
//        if (n == -1) return x;
//
//        double res = myPow(x, n / 2);
//
//        if (n > 0) {
//            if (n % 2 == 0) {
//                return res * res;
//            } else {
//                return x * res * res;
//            }
//
//        } else {
//            if (n % 2 == 0) {
//                return (1.0 / (res * res));
//            } else {
//                return (1.0 / (res * res));
//            }
//        }
//    }
//}
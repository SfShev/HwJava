public class PowerofTwo {
    public static boolean isPowerOfTwo(int n) {

        if (n == 1) {
            return true;
        }

        if (n % 2 != 0) {

            return false;

        } else {
            isPowerOfTwo(n / 2);

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(12));
    }
}

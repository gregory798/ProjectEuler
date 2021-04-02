import java.lang.Math;

class Solution
{
    static int f(int n)
    {
        int max = (int) Math.pow(10, n) - 1;
        int min = 1 + max / 10;
        int max_product = 0;

        for (int i = max; i >= min; i--) {
            for (int j = i; j >= min; j--) {
                int product = i * j;
                if (product < max_product)
                    break;
                int number = product;
                int reverse = 0;
                while (number != 0) {
                    reverse = reverse * 10 + number % 10;
                    number /= 10;
                }
                if (product == reverse && product > max_product)
                    max_product = product;
            }
        }
        return max_product;
    }
    public static void main (String[] args)
    {
        System.out.print(f(3));
    }
}

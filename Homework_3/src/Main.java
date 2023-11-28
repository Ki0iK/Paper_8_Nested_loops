public class Main {
    public static void main(String[] args)
    {
        int[] Nums = {3, 7, 4};
        int K = 0;

        while (K < Nums.length)
        {
            int L = 0;
            while (L < Nums.length)
            {
                if ( K != L)
                    System.out.println(10 * Nums[K] + Nums [L]);
                L = L + 1;
            }
            K = K + 1;
        }

    }
}
 
class MaxSum
{
    public static void main (String[] args)
    {
        int [] a = {-2, -1, 4, -1, -2, 3, 2, -3};
        System.out.println("Maximum sum of subarray is " +
                                       maxSum(a));
    }
 
    static int maxSum(int a[])
    {
        int max_sum1 = 0, max_sum2 = 0;
 
        for (int i = 0; i< a.length; i++)
        {
            max_sum1 = max_sum1 + a[i];
            if (max_sum2 < max_sum1)
                max_sum2 = max_sum1;
            if (max_sum1 < 0)
                max_sum1 = 0;
        }
        return max_sum2;
    }
}

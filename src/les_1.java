import java.util.ArrayList;
import java.util.List;

public class les_1 {
    private static int sum(int bound)
    { // O(n)
        int sum = 0;
        for (int i = 0; i <= bound; i++)
        {
            sum += i;
        }
        return sum;
    }

    private static List<Integer> searchUsualNumbers(int bound)
    { // O(n^2)
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= bound; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i%j == 0)
                {
                    break;
                }
                 else if (j == i - 1)
                {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private static int combinationsCalculator(int count, int faces)
    {
        if (count > 0)
        {
            return recursiveCounter (1, count, faces);
        }
        else
        {
            return 0;
        }
    }
    private static int recursiveCounter(int depth, int maxDepth, int faces)
    { // O(2^(n-1))
        int count = 0;
        for (int i = 1; i <= faces; i++)
        {
            if (depth == maxDepth)
            {
                count++;
            }
            else
            {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }

    private static int fibRecursive(int n)
    {
        if (n <= 2)
        {
            return 1;
        }
        else
        {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }

    private static int fibArray(int n)
    { // O(n)
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++)
        {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }



    public static void main(String[] args) {
//        System.out.println(sum(5));
//        searchUsualNumbers(20).forEach(System.out::println);
//        System.out.println(combinationsCalculator(6, 6));
//        System.out.println(fibRecursive(9));
//        System.out.println(fibArray(9));
    }
}

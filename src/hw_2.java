import java.util.ArrayList;
import java.util.List;

public class hw_2 {
    private static void heapify(int[] arr, int i, int len) {
        int par = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if (left < len && arr[left] > arr[par])
        {
            par = left;
        }
        if (right < len && arr[right] > arr[par])
        {
            par = right;
        }
        if (i != par)
        {
            int temp = arr[i];
            arr[i] = arr[par];
            arr[par] = temp;
            heapify(arr, par, len);
        }
    }

    private static void heapSort(int[] arr)
    { // O(log n)
        int len = arr.length;
        for (int i = len / 2 -1; i >= 0; i--)
        {
            heapify(arr, i, len);
        }

        for (int i = len - 1; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 66, 124, 4, 1, 0, 342};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

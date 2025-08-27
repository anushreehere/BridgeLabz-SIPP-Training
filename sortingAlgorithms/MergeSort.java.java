public class MergeSort {
    public static void main(String[] args) {
        int[] prices = {500, 200, 800, 100, 300};
        mergeSort(prices, 0, prices.length - 1);

        System.out.print("Sorted Prices: ");
        for (int price : prices)
            System.out.print(price + " ");
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = 0; i < temp.length; i++)
            arr[left + i] = temp[i];
    }
}

package 剑指offer;

public class 数组中的逆序对 {
    int result = 0;

    public int InversePairs(int[] array) {
        if (array.length != 0) {
            divide(array, 0, array.length - 1);
        }
        return result;
    }

    private void divide(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            divide(array, start, mid);
            divide(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
                result = (result + mid - i + 1) % 1000000007;
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= end) {
            temp[k++] = array[j++];
        }
        for (k = 0; k < temp.length; k++) {
            array[start + k] = temp[k];
        }
    }
}

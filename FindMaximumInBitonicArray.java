//Bitonic Array -An array that first increases and then decreases, or can be strictly increasing or strictly decreasing.

public class FindMaximumInBitonicArray {
    public static void main(String[] args) {
        int[] a = { 10, 8, 6, 4, 2 };
        int si = 0;
        int ei = a.length - 1;
        int result = search(si, ei, a);
        System.out.println(result);

    }

    public static int search(int si, int ei, int[] a) {
        if(ei == si){
            return a[si];
        }
        if (ei == si + 1) {
            if (a[si] >= a[ei]) {
                return a[si];
            } else
                return a[ei];
        }

        int mid = si + (ei - si) / 2;

        if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) {
            return a[mid];
        } else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
            return search(mid + 1, ei, a);
        } else
            return search(si, mid - 1, a);
    }
}

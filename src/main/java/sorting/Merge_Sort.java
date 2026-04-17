package sorting;

public class Merge_Sort {
    void main() {
        int arr[] = {38, 27, 43, 10, 2, 4};

        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║         MERGE SORT EXECUTION FLOW ANALYSIS                          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
        System.out.println("\n📍 Initial Array: [38, 27, 43, 10]");
        System.out.println("\n" + "=".repeat(70));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("=".repeat(70));
        System.out.println("\n✅ FINAL SORTED ARRAY: ");
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }

    private void mergeSort(int[] arr, int i, int i1) {
        String indent = "  ".repeat(getDepth(i, i1));

        if (i < i1) {
            int m = (i + i1) / 2;

            System.out.println("\n" + indent + "🔴 [SPLIT] Dividing arr[" + i + ".." + i1 + "] into two halves");
            System.out.println(indent + "    └─ Left part: arr[" + i + ".." + m + "]");
            System.out.println(indent + "    └─ Right part: arr[" + (m + 1) + ".." + i1 + "]");
            System.out.println(indent + "    Subarray elements: " + arrayToString(arr, i, i1));

            System.out.println("\n" + indent + "↙️ Processing LEFT subtree (arr[" + i + ".." + m + "])");
            mergeSort(arr, i, m);

            System.out.println("\n" + indent + "↘️ Processing RIGHT subtree (arr[" + (m + 1) + ".." + i1 + "])");
            mergeSort(arr, m + 1, i1);

            System.out.println("\n" + indent + "🟢 [MERGE] Merging sorted halves of arr[" + i + ".." + i1 + "]");
            merge(arr, i, m, i1);
            System.out.println(indent + "    After merge: " + arrayToString(arr, i, i1));
        } else {
            System.out.println("\n" + indent + "⚪ [BASE CASE] Single element at index " + i + " (value: " + arr[i] + ") - Already sorted");
        }
    }

    private void merge(int[] arr, int i, int m, int i1) {
        int n1 = m - i + 1;
        int n2 = i1 - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        String indent = "  ".repeat(getDepth(i, i1));

        // Copy left subarray
        for (int j = 0; j < n1; ++j)
            L[j] = arr[i + j];

        // Copy right subarray
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        System.out.println(indent + "    LEFT array (L):  " + arrayToString(L));
        System.out.println(indent + "    RIGHT array (R): " + arrayToString(R));

        int j = 0, k = 0;
        int comparisonNum = 0;

        for (int l = i; l < i1 + 1; l++) {
            if (j < n1 && k < n2) {
                comparisonNum++;
                if (L[j] <= R[k]) {
                    System.out.println(indent + "    Compare #" + comparisonNum + ": L[" + j + "]=" + L[j] + " <= R[" + k + "]=" + R[k] +
                            " ✓ → Place " + L[j] + " at arr[" + l + "]");
                    arr[l] = L[j];
                    j++;
                } else {
                    System.out.println(indent + "    Compare #" + comparisonNum + ": L[" + j + "]=" + L[j] + " > R[" + k + "]=" + R[k] +
                            " ✗ → Place " + R[k] + " at arr[" + l + "]");
                    arr[l] = R[k];
                    k++;
                }
            } else if (j < n1) {
                System.out.println(indent + "    Remaining: Place L[" + j + "]=" + L[j] + " at arr[" + l + "] (R exhausted)");
                arr[l] = L[j];
                j++;
            } else {
                System.out.println(indent + "    Remaining: Place R[" + k + "]=" + R[k] + " at arr[" + l + "] (L exhausted)");
                arr[l] = R[k];
                k++;
            }
        }
    }

    // Helper method to calculate recursion depth for indentation
    private int getDepth(int i, int i1) {
        int range = i1 - i + 1;
        int depth = 0;
        int size = 4;
        while (size > range) {
            depth++;
            size = size / 2;
        }
        return Math.min(depth, 3); // Limit indentation
    }

    // Helper method to convert array to readable string
    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert array range to readable string
    private String arrayToString(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = start; i <= end; i++) {
            sb.append(arr[i]);
            if (i < end) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}

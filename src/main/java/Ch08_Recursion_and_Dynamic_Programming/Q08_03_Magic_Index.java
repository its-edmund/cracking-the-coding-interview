package Ch08_Recursion_and_Dynamic_Programming;

public class Q08_03_Magic_Index {
    
    // brute force method
    // public int findMagicIndex(int[] arr) {
    //     for(int i = 0; i < arr.length; i++) {
    //         if(arr[i] == i) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public int findMagicIndex(int[] arr) {
        return findMagicIndex(arr, 0, arr.length - 1);
    }

    public int findMagicIndex(int[] arr, int beg, int end) {
        int middle = (beg + end) / 2;
        if(beg > end) {
            return -1;
        }
        if(arr[middle] == middle) {
            return middle;
        }
        else if(arr[middle] > middle) {
            return findMagicIndex(arr, beg, middle - 1);
        } else if (arr[middle] < middle) {
            return findMagicIndex(arr, middle + 1, end);
        }
        return -1;
    }
}

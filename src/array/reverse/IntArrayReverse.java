package array.reverse;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntArrayReverse {

    public static int[] reverse(int[] arr) {
        return IntStream.range(0, arr.length)
            .map(i->arr[arr.length-1-i])
            .toArray();
    }

    public static int[] reverse1(int[] arr) {
        if(null == arr || arr.length == 0) return arr;
        for(int low = 0, high = arr.length-1; low < arr.length/2  ; low++, high--) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
        }
        return arr;
    }

    public static int[] reverse2(int[] arr) {
        if(null == arr || arr.length == 0) return arr;
        int[] newarr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            newarr[arr.length-1-i] = arr[i];
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2 };
        Arrays.stream(reverse2(arr)).forEach(System.out::println);
    }
}

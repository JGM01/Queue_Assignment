import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 33;
        array[1] = 11;
        array[2] = 99;
        array[3] = 1;
        array[4] = 22;
        array[5] = 88;
        array[6] = 55;
        array[7] = 44;
        array[8] = 66;
        array[9] = 77;

        displayArray(array);
        array = radixSort(array);
        displayArray(array);
    }

    static int[] radixSort(int[] input) {
        for (int place = 1; place <= 1000000000; place *= 10) {
            input = sort(input, place);
        }

        return input;
    }

    static int[] sort(int[] input, int place) {
        int[] out = new int[input.length];
        Queue[] bucket = new Queue[10];

        for (int i = 0; i < 10; i++) {
            bucket[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            int digit = getDigit(input[i], place);
            bucket[digit].offer(input[i]);
        }

        int i = 0;
        int idx = 0;
        while (idx < 10) {
            if (bucket[i].size() != 0) {
                out[idx++] = (int) bucket[i].poll();
            } else {
                i++;
            }
        }
        return out;
    }

    static int getDigit(int value, int digitPlace) {
        return (value / digitPlace) % 10;
    }

    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
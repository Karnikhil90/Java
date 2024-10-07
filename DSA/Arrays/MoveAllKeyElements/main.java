package DSA.Arrays.MoveAllKeyElements;

import lib.mylibs; // my costom libaray
/*
 *  Move all the 'key'(will be user defined like 0) present in the array to the end and return the same array. All the thing should be in the given array.
 *  Example:
 *  array[] = { 0, 1, 2, 0, 0, 3, 0, 4, 5 }, key = 0
 *  Output : { 1, 2, 3, 4, 5, 0, 0, 0, 0 }
 */

public class main {
    public static int[] moveInLast(int[] arrays, int key) {
        int len = arrays.length; // to make it fast . Just save the length.
        for (int index = 0; index < len; index++) {
            if (arrays[index] == key) {
                // find the next 'non-key' index and swap this index with it as nxtIdx
                int nxtIdx = index, curIdx = index;
                while (curIdx < len) {
                    if (arrays[curIdx] != key) {
                        nxtIdx = curIdx;
                        break;
                    }
                    curIdx++;
                }
                // swap with that index
                int temp = arrays[index];
                arrays[index] = arrays[nxtIdx];
                arrays[nxtIdx] = temp;
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        lib.mylibs obj = new mylibs();
        int[] arrays = { 0, 1, 2, 0, 0, 3, 0, 4, 5 };
        obj.print(moveInLast(arrays, 0));
    }
}

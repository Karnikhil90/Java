package lib;

public class mylibs extends SysInput {
    public static int[] range(int start, int limit, int update) {
        if (update <= 0)
            throw new IllegalArgumentException("Update value must be greater than 0.");

        int size = (limit - start + update - 1) / update;
        int[] array = new int[size];
        // int i = start;
        int index = 0;

        while (start < limit) {
            array[index] = start;
            start += update;
            index++;
        }

        return array;
    }

    public static int[] range(int start, int limit) {
        return range(start, limit, 1);
    }

    public static int[] range(int limit) {
        return range(0, limit, 1);
    }

    public static boolean in(int[] array, int elemet) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == elemet) {
                return true;
            }
        }
        return false;
    }

    public static boolean in(int[] array, int[] secondaryArray) {
        for (int i = 0; i < secondaryArray.length; i++) {
            if (!in(array, secondaryArray[i]))
                return false;
        }
        return true;
    }

    public static boolean in(String[] array, String elemet) {
        for (String data : array) {
            if (data.equals(elemet))
                return true;
        }
        return false;
    }

    public static <T> void print(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void print(int[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = String.valueOf(array[i]); // Autoboxing: double to Double conversion
        }
        print(newArray);
    }

    public static void print(double[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = String.valueOf(array[i]); // Autoboxing: double to Double conversion
        }
        print(newArray);
    }

}

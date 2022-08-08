package common;

public final class Tools {

    public static void println(int[] arr) {
        if (arr == null) {
            System.out.println("arr=null");
            return;
        }
        for (int t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    @SafeVarargs
    public static <T> void println(T... arr) {
        if (arr == null) {
            System.out.println("arr=null");
            return;
        }
        for (T t : arr) {
            if (t != null) {
                System.out.print(t);
            } else {
                System.out.print("null");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}

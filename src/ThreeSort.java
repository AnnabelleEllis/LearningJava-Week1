public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max1 = Math.max(a, Math.max(b, c));
        int min1 = Math.min(a, Math.min(b, c));
        int median = a + b + c - min1 - max1;
        System.out.println(min1);
        System.out.println(median);
        System.out.println(max1);
        System.out.println(2 + 3 + "bc");
    }

//    private static int min(int b, int c) {
//        if (b > c) {
//            return c;
//        } else {
//            return b;
//        }
//    }
//
//    private static int max(int b, int c) {
//    }
}

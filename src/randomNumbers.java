public class randomNumbers {
    public static void main(String[] args) {
        double num;
        int n = 5;
        double[] store = new double[n];
        int i = 0;
        while (i < 5) {
            num = Math.random();
            for (int j = 0; j < n; j++) {
                store[i] = num;
            }
            System.out.println(num);
            i++;
        }
//        System.out.println(Arrays.toString(store));
//        System.out.println(getMax(store));
//
//        public static double getMax ( double[] myArray){
//            for (int b = 1; b < n; b++) {
//                double max = myArray[0];
//                if (myArray[b] > max) {
//                    max = myArray[b];
//                }
//            }
//            return (max);
//        }


    }
}

public class EuclideanFormulae {
    public static void main(String[] args) {
        int origin1 = 0;
        int origin2 = 0;
        int p1 = Integer.parseInt(args[0]);
        int p2 = Integer.parseInt(args[1]);

        int distance = (int) Math.pow((origin1 - p1), 2) + (int) Math.pow((origin2 - p2), 2);
        int d = (int) Math.sqrt(distance);
        System.out.println(d);
    }
}

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // If you use the nextLine() method immediately 
        // following the nextInt() method, recall that nextInt() reads         
        // integer tokens; because of this, the last newline character 
        // for that line of integer input is still queued 
        // in the input buffer and the next nextLine() 
        // will be reading the remainder of the integer line 
        // (which is empty).
      
//       Input (stdin)
//       42
//       3.1415
//       Welcome to HackerRank's Java tutorials!
        
        Scanner scan = new Scanner(System.in);
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

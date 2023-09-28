import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int lr = sc.nextInt();
        int ur = sc.nextInt();
        System.out.println("Entered number range is: (" + lr + " to " + ur + ")");
        int count = ur - lr;
        int init = 0;
        for (int i = 0; i <= count; i++) {
            init += i;
        }
        System.out.println(init);
    }
}

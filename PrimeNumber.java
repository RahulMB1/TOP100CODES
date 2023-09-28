import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean is_Prime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                is_Prime = false;
                break;
            }
        }
        if (is_Prime) {
            System.out.println("Prime Number");
        } else
            System.out.println("Not prime");
    }
}

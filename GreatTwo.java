import java.util.Scanner;

public class GreatTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 > n2)
            System.out.println(n1 + " is greater than " + n2);
        if (n2 > n1)
            System.out.println(n2 + " is greater than " + n1);
    }
}

import java.util.Scanner;

public class GreatThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3)
            System.out.println(n1 + " is greater");
        if (n2 > n1 && n2 > n3)
            System.out.println(n2 + " is greater");
        if (n3 > n1 && n3 > n2)
            System.out.println(n3 + " is greater");
    }
}

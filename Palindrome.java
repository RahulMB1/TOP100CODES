import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num = num / 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

    }
}

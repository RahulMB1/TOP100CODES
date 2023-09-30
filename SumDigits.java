import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        String StrNum = Integer.toString(num);
        int length = StrNum.length();
        for (int i = 0; i < length; i++) {
            temp += (num % 10);
            num = num / 10;
        }
        System.out.println(temp);
    }
}

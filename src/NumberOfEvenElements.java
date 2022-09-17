import java.util.Scanner;

public class NumberOfEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = -1;
        int a = 0;
        do {
            a = scan.nextInt();
            if (a % 2 == 0) {
                i++;
            }
        } while (a != 0);
        System.out.println(i);
    }
}
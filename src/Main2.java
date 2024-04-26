import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return sum(a+1, b-1);
    }
}
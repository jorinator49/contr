import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(summa());
    }

    public static int summa() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            return 0;
        }
        return n + summa();
    }
}
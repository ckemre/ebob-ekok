import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N1 sayisi giriniz : ");
        int n1 = input.nextInt();

        System.out.print("N2 sayisi giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int i = 1;
        int d = 1;
        int gcd = 1;
        int lcm;

        if (n1 < 0 || n2 < 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz");

        } else {
            if (n1 < n2) {
                while (d <= n1) {
                    if (n1 % d == 0 && n2 % d == 0) {
                        gcd = d;
                    }
                    d++;

                }

                while (i <= n1) {
                    i++;
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                    }
                }
                System.out.println("EBOB : " + ebob);
                System.out.println("EKOK : " + (n1 * n2) / ebob);
            }
        }
    }
}

import java.util.Scanner;

public class KuvvetProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int kuvvet4 = 4 * i;
            int kuvvet5 = 5 * i;
            System.out.println(i + ". sayının 4'ün katı: " + kuvvet4);
            System.out.println(i + ". sayının 5'in katı: " + kuvvet5);
        }
    }
} 
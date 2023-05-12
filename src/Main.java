import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int serieRange, a = 0, b = 1, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz: ");
        serieRange = input.nextInt();

        System.out.print(serieRange +" Elemanlı Fibonacci Serisi: ");
        System.out.print(a + " " + b +" ");
        for (int i = 1; i < serieRange; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
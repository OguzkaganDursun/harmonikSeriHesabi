import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int n;
        double toplam = 0;

        //Kullanicidan veriler alindi ve hesaplanarak ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayisini Giriniz : ");
        n = scan.nextInt();

        for (double i = 1; i <= n; i++)
        {
            toplam += (1.0/i);
        }
        System.out.println("Harmonik Seri : " + toplam);
    }
}

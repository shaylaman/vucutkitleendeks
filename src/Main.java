import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy, endx, kg;
        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz(Mt): ");
        boy = inp.nextDouble();
        System.out.println("Kilonuzu giriniz(Kg): ");
        kg = inp.nextDouble();
        endx = (kg / (boy * boy));
        System.out.println("Vucut Kitle Endeksiniz: " + endx);

    }
}
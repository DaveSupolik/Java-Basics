package cz.davesupolik.konstanty;

public class Konstanty {
    public static void run() {
        // Deklarace konstanty pomocí klíčového slova final
        final double PI = 3.14159;

        // Výpočet obvodu kruhu
        double polomer = 5.0;
        double obvod = 2 * PI * polomer;

        System.out.println("Poloměr: " + polomer);
        System.out.println("Obvod kruhu: " + obvod);

        // Pokus o změnu hodnoty PI by způsobil chybu:
        // PI = 3.14; // -> Kompilační chyba


        double polomer2 = 10.0;
        double obsahKruhu = MathKonstanty.PI * polomer2 * polomer2;

        System.out.println("Hodnota Eulerova čísla: " + MathKonstanty.E);
        System.out.println("Obsah kruhu: " + obsahKruhu);
    }
}


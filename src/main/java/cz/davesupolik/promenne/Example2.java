package cz.davesupolik.promenne;

public class Example2 {
    public static void run() {
        // ZÁKLADNÍ POUŽITÍ PROMĚNNÝCH
        // Deklarace proměnných
        int cislo1 = 10;
        int cislo2 = 20;

        // Výpočty
        int soucet = cislo1 + cislo2; // Sčítání
        int rozdil = cislo2 - cislo1; // Odečítání
        int soucin = cislo1 * cislo2; // Násobení
        double podil = (double) cislo2 / cislo1; // Dělení (s přetypováním na double)

        // Výstup hodnot na konzoli
        System.out.println("První číslo: " + cislo1);
        System.out.println("Druhé číslo: " + cislo2);
        System.out.println("Součet: " + soucet);
        System.out.println("Rozdíl: " + rozdil);
        System.out.println("Součin: " + soucin);
        System.out.println("Podíl: " + podil);
    }
}
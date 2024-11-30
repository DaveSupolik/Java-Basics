package cz.davesupolik.typy;

public class ReferencniTypy  {
    public static void run() {
        // Referenční datový typ: String
        String text = "Ahoj, světe!";
        System.out.println("Text: " + text);

        // Referenční datový typ: Pole (Array)
        int[] cisla = {1, 2, 3, 4, 5};
        System.out.println("První prvek pole: " + cisla[0]);

        // Změna obsahu objektu
        cisla[0] = 10; // Měníme první prvek pole
        System.out.println("Nový první prvek pole: " + cisla[0]);

        // Vytvoření vlastního objektu
        Osoba osoba = new Osoba("Petr", 30);
        System.out.println("Osoba: " + osoba.getJmeno() + ", Věk: " + osoba.getVek());
    }
}

// Třída pro referenční typ
class Osoba {
    private String jmeno;
    private int vek;

    public Osoba(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }
}
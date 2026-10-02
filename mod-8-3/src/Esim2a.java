/*
Lambda parametrina;
Tässä esimerkissä tehdään versio, jolla voitaisiin kaikki suorittaa kaikki peruslaskutoimitukset.
Käytetään itse tehtyä rajapintaa Laskenta.
 */

// Oma funktionaalinen rajapinta
@FunctionalInterface
interface Laskenta {
    int suorita(int a, int b);
}

public class Esim2a {
    public static void main(String[] args) {
        Esim2a run = new Esim2a();

        // Nimetty lambda lukujen tulolle
        Laskenta tulo = (a, b) -> a * b;

        int summa = run.laske(3, 4, (a, b) -> a + b);
        // nimetty lambda tekee tässä ehkä helpommin luettavaa koodia
        int tulos2  = run.laske(5, 6, tulo);

        System.out.println(summa); // 7
        System.out.println(tulos2);  // 30
    }

    // Metodi, joka käyttää omaa rajapintaa
    int laske(int a, int b, Laskenta op) {
        return op.suorita(a, b);
    }
}
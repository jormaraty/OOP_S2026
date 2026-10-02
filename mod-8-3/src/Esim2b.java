
/*
Tässä versiossa luokan Esim2a on tehty käyttäen
Java.util.function:n valmista funktionaalista rajapintaa.
Huomaa lask2b -metodissa valmistoiminto applyAsInt().
Tässä ei käytetä nimettyä lambdaa, menisi vastaavasti kuin Esim2a:ssa.
 */

import java.util.function.IntBinaryOperator;

public class Esim2b {
    public static void main(String[] args) {
        Esim2b run = new Esim2b();
        run.laskuoperaatiot();
    }

    private void laskuoperaatiot() {
        int summa  = laske2b(3, 4, (a, b) -> a + b);
        int erotus = laske2b(10, 2, (a, b) -> a - b);
        int tulo   = laske2b(5, 6, (a, b) -> a * b);

        System.out.println(summa);   // 7
        System.out.println(erotus);  // 8
        System.out.println(tulo);    // 30
    }

    // Käytetään valmista funktionaalista rajapintaa
    int laske2b(int a, int b, IntBinaryOperator op) {
        return op.applyAsInt(a, b);
    }
}

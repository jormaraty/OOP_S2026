/*
Esimerkkejä lambda-operaatiosta.

Huom: lambda-operaatiolla täytyy aina olla tyyppinä ns. funktionaalinen rajapinta:
- oma tai Javan valmis

Huom2: jos lambda palauttaa vain yhden arvon, niin return lause ei ole pakollinen.
 */

import java.util.function.IntBinaryOperator;

public class Esim1 {
    public static void main(String[] args) {
         Esim1 run = new Esim1();
         run.anonyymi_funktio();
    }

    // anonyymi luokka
    private void anonyymi_funktio() {
        // 2 tapaa: oma rajapinta tai Javan valmis

        // a) oma rajapinta, sen nimi ihan itse keksitty
        @FunctionalInterface
        interface Summaus {
            int summaa(int a, int b);
        }

        Summaus summa = (a, b) -> a + b;
        int tulos = summa.summaa(10, 20);
        System.out.println("Omalla rajapinnalla" +  tulos);

        // valmis Javan rajapinta
        IntBinaryOperator summa2 = (a, b) -> a + b;

        // kutsutaan eo. koodia
        int tulos2 = summa2.applyAsInt(15, 20);
        System.out.println("Valmiilla rajapinnalla: " + tulos2);

    }

    private void lambda_funktion_parametrina() {
        // idea: normaali funktio saa funktionaalisen rajapinnan
        
    }
}

package org.pharmagest.monalisa;

import java.util.Locale;

public class Dojo {
    
    public static void main(String[] args) {
        final String message = "lol";
        new Afficheur().afficher(message);
        new Afficheur(s -> s.toUpperCase(Locale.FRANCE), s -> s.length() < 5).afficher(message);
        final String message2 = "lollollol";
        new Afficheur().setChecker(s -> s.length() > 5).afficher(message2);
    }
}

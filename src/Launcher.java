import checker.CheckerWithoutA;
import transformer.TransformerLowerCase;
import transformer.TransformerUpperCase;

public class Launcher {
    
     public static void main(String[] args) {
         Afficheur afficheur = new Afficheur(new CheckerWithoutA(), new TransformerUpperCase());
         afficheur.afficher("monTextea");
         afficheur.afficher("monTexte");
    
         Afficheur afficheur2 = new Afficheur(new CheckerWithoutA(), new TransformerLowerCase());
         afficheur2.afficher("monTextea");
         afficheur2.afficher("monTexte");
    
     }
}

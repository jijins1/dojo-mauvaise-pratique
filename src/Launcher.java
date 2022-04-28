import checker.Checker;
import checker.CheckerMoreThan5;
import checker.CheckerWithoutA;
import transformer.TransformerLowerCase;
import transformer.TransformerNoTransform;
import transformer.TransformerUpperCase;

public class Launcher {
    
     public static void main(String[] args) {
         
         
         Afficheur afficheur = new Afficheur(Checker.list(new CheckerWithoutA(), new CheckerMoreThan5()), new TransformerUpperCase());
         afficheur.afficher("1");
         afficheur.afficher("monTextea");
         afficheur.afficher("monTexte");
         afficheur.afficher("monTexte");
    
         Afficheur afficheur2 = new Afficheur(new CheckerWithoutA(), new TransformerLowerCase());
         afficheur2.afficher("2");
         afficheur2.afficher("monTextea");
         afficheur2.afficher("monTexte");
    
    
         Afficheur afficheur3 = new Afficheur(new CheckerMoreThan5(), new TransformerNoTransform());
         afficheur3.afficher("3");
         afficheur3.afficher("monTextea");
         afficheur3.afficher("monTexte");
    
     }
}

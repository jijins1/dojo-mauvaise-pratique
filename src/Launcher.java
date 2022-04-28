import checker.CheckerWithoutA;

public class Launcher {
    
     public static void main(String[] args) {
         Afficheur afficheur = new Afficheur(new CheckerWithoutA());
         afficheur.afficher("monTextea");
         afficheur.afficher("monTexte");
     }
}

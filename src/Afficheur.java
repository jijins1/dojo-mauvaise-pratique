import checker.Checker;

public class Afficheur {
    private Checker checker;
    public Afficheur(Checker checker) {
        this.checker = checker;
    }
    
    public void afficher(String message){
        if(checker.isValid(message)){
            System.out.println(message);
        }
    }
}

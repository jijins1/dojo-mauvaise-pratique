import checker.Checker;
import transformer.Transformer;

public class Afficheur {
    private final Checker checker;
    private final Transformer transformer;
    
    public Afficheur(Checker checker, Transformer transformer) {
        this.checker = checker;
        this.transformer = transformer;
    }
    
    public void afficher(String message){
        if(checker.isValid(message)){
            System.out.println(transformer.transform(message));
        }
    }
}

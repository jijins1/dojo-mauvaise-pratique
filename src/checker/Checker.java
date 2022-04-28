package checker;

public interface Checker {
    
    boolean isValid(String message);
    
    
    static Checker list(Checker... checkers){
        return new CheckerList(checkers);
    }
    
}

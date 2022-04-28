package checker;

import java.util.List;

public class CheckerList implements Checker {
    private List<Checker> checkers;
    
    protected CheckerList(Checker... checkers) {
        this.checkers = List.of(checkers);
    }
    
    @Override
    public boolean isValid(final String message) {
        return checkers.stream().allMatch(checker -> checker.isValid(message));
    }
}

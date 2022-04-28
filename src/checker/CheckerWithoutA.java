package checker;

public class CheckerWithoutA implements Checker {
    @Override
    public boolean isValid(final String message) {
        return !message.contains("a");
    }
}

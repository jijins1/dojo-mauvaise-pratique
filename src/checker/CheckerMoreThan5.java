package checker;

public class CheckerMoreThan5 implements Checker {
    @Override
    public boolean isValid(final String message) {
        return message.length() > 5;
    }
}

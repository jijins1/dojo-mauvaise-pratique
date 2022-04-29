package org.pharmagest.monalisa;

import java.util.function.Function;
import java.util.function.Predicate;

public final class Afficheur {
    
    private Function<String, String> decorator;
    private Predicate<String> checker;
    
    public Afficheur() {
        this.decorator = Function.identity();
        this.checker = s -> true;
    }
    
    public Afficheur(Function<String, String> decorator, Predicate<String> checker) {
        this.decorator = decorator;
        this.checker = checker;
    }
    
    public void afficher(String message) {
        if (isAffichable(message))
            System.out.println(decorator.apply(message));
    }
    
    private boolean isAffichable(final String message) {
        return checker.test(message);
    }
    
    public Function<String, String> getDecorator() {
        return decorator;
    }
    
    public Afficheur setDecorator(final Function<String, String> decorator) {
        this.decorator = decorator;
        return this;
    }
    
    public Predicate<String> getChecker() {
        return checker;
    }
    
    public Afficheur setChecker(final Predicate<String> checker) {
        this.checker = checker;
        return this;
    }
    
}

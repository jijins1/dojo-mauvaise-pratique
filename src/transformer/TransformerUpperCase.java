package transformer;

import java.util.Locale;

public class TransformerUpperCase implements Transformer {
    @Override
    public String transform(final String message) {
        return message.toUpperCase(Locale.ROOT);
    }
}

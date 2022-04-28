package transformer;

import java.util.Locale;

public class TransformerLowerCase implements Transformer {
    @Override
    public String transform(final String message) {
        return message.toLowerCase(Locale.ROOT);
    }
}

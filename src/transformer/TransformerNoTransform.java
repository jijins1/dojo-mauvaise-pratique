package transformer;

public class TransformerNoTransform implements Transformer{
    @Override
    public String transform(final String message) {
        return message;
    }
}

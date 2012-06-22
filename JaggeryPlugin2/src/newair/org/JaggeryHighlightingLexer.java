package newair.org;

import com.intellij.lexer.LayeredLexer;
import com.intellij.lexer.StringLiteralLexer;
import com.intellij.psi.tree.IElementType;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/12/12
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class JaggeryHighlightingLexer extends LayeredLexer {

    public JaggeryHighlightingLexer() {
        super(new JaggeyLexer());

        registerSelfStoppingLayer(new StringLiteralLexer(StringLiteralLexer.NO_QUOTE_CHAR, JaggeryTokenTypes.VALUE_CHARACTERS, true, "#!=:"),
                new IElementType[]{JaggeryTokenTypes.VALUE_CHARACTERS},
                IElementType.EMPTY_ARRAY);


        registerSelfStoppingLayer(new StringLiteralLexer(StringLiteralLexer.NO_QUOTE_CHAR, JaggeryTokenTypes.KEY_CHARACTERS, true, "#!=: "),
                new IElementType[]{JaggeryTokenTypes.KEY_CHARACTERS},
                IElementType.EMPTY_ARRAY);registerSelfStoppingLayer(new StringLiteralLexer(StringLiteralLexer.NO_QUOTE_CHAR, JaggeryTokenTypes.KEY_CHARACTERS, true, "#!=: "),
                new IElementType[]{JaggeryTokenTypes.KEY_CHARACTERS},
                IElementType.EMPTY_ARRAY);



    }
}

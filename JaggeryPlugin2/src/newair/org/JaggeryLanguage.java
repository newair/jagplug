package newair.org;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/18/12
 * Time: 3:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class JaggeryLanguage extends Language {

    public static final JaggeryLanguage INSTANCE = new JaggeryLanguage();


    protected JaggeryLanguage() {
                     super("Jaggery", "text/Jaggery");


        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
            @NotNull
            protected SyntaxHighlighter createHighlighter() {
                return new SyntaxHighlightHandler();
            }
        });
    }
}

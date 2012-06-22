package newair.org;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/8/12
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class JflexLexer  implements FlexLexer  {
    @Override
    public void yybegin(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int yystate() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTokenStart() {
        return 7;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTokenEnd() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IElementType advance() throws IOException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void reset(CharSequence charSequence, int i, int i1, int i2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }



}

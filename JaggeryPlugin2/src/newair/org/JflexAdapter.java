package newair.org;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/8/12
 * Time: 1:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class JflexAdapter extends FlexAdapter {





    public JflexAdapter(FlexLexer flex) {
        super(flex);    //To change body of overridden methods use File | Settings | File Templates.
    }





    @Override
    public IElementType getTokenType() {
        return super.getTokenType();    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public void start(CharSequence buffer, int startOffset, int endOffset, int initialState) {
        super.start(buffer, startOffset, endOffset, initialState);    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public void advance() {
        super.advance();    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public int getBufferEnd() {
        return super.getBufferEnd();    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public CharSequence getBufferSequence() {
        return super.getBufferSequence();    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public FlexLexer getFlex() {
        return super.getFlex();    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public int getState() {
        return super.getState();    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public int getTokenEnd() {
        return super.getTokenEnd();    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public int getTokenStart() {
        return super.getTokenStart();    //To change body of overridden methods use File | Settings | File Templates.
    }
}

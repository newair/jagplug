package newair.org;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/8/12
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyLexer extends Lexer {


    private int startToken;
    private int endToken;
    private int state;
    private CharSequence cs;



    @Override
    public void start(CharSequence charSequence, int i, int i1, int i2) {
        //To change body of implemented methods use File | Settings | File Templates.


                this.cs = charSequence;
                this.state = i;
                this.startToken = i1;
                this.endToken = i2;






    }


    public CharSequence getTokenSequence(){
              return null;

    }







    @Override
    public int getState() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IElementType getTokenType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTokenStart() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getTokenEnd() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void advance() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public LexerPosition getCurrentPosition() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void restore(LexerPosition lexerPosition) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public CharSequence getBufferSequence() {
        return cs;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getBufferEnd() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

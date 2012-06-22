package newair.org;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * User: amila
 * Date: 6/12/12
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class JaggeyLexer extends FlexAdapter {


    public JaggeyLexer(){


        super(new JavaScriptLexer((Reader)null));


    }





}
